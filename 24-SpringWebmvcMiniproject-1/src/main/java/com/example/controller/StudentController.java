package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.entity.Student;
import com.example.service.CourseService;
import com.example.service.EnrollmentService;
import com.example.service.GradeService;
import com.example.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	@Autowired
	private GradeService gradeService;
	@Autowired
	private EnrollmentService enrollmentService;
	@Autowired
	private CourseService courseService;
	
	
	
	@GetMapping("/")
	public String  loadStudent(Model model) {
		model.addAttribute("pobj", new Student());
		return "index";
	}
	
	
	@PostMapping("/students")
	public String saveProduct(Model model,Student s) {

		boolean student = studentService.addStudent(s);
		if (student) {
			model.addAttribute("smsg", "Student Saved");
		} else {
			model.addAttribute("emsg", "Failed to save");
		}
		model.addAttribute("pobj", new Student());// for form binding
		
		return "index";
	}
	
	@GetMapping("/studentlist")
	public String getAllProducts(Model model,Student s) {
		 List<Student> allStudents = studentService.getAllStudents();
		 model.addAttribute("get",allStudents);
		
		return "student";
	}
	
	
	
	/* @PostMapping
	 public ResponseEntity<Student> addStudent(@RequestBody Student student) {
	 Student savedStudent = studentService.addStudent(student);
	 return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
	 }

	 @GetMapping("/{id}")
	 public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
	 Student student = studentService.getStudentById(id);
	 return ResponseEntity.ok(student);
	 }

	 @GetMapping
	 public ResponseEntity<List<Student>> getAllStudents() {
	 List<Student> students = studentService.getAllStudents();
	 return ResponseEntity.ok(students);
	 }
*/
}
