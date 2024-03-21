package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.entity.Student;
import in.ashokit.service.StudentService;

@Controller
public class StudentController {
@Autowired
	private StudentService service;

@GetMapping("/")
public ModelAndView loadform() {
	
	ModelAndView mv=new ModelAndView();
	mv.addObject("form",new Student());
	mv.setViewName("registration");
	return mv;
}

@PostMapping("/student")
public ModelAndView register(@ModelAttribute("form") Student s) {
	 
    String email = s.getEmail();
    String subject = "Registration Successful";
    String text = "Congratulations! You have successfully registered.";
    service.sendEmail(email, subject, text);
    ModelAndView modelAndView = new ModelAndView("registration");
    service.saveemps(s);
    modelAndView.addObject("form",new Student());
    modelAndView.addObject("message", "Registration Successful");
    
    return modelAndView;
}
@GetMapping("/login")
public ModelAndView loginform() {
	 ModelAndView mv = new ModelAndView();
	 
	 mv.addObject("form",new  Student());
	 mv.setViewName("login");
	 return mv;
}
@PostMapping("/login")
public String studentlogin( @ModelAttribute("form")Student s , BindingResult result) {
	 ModelAndView mv = new ModelAndView();
	 if (!service.validateUser(s.getEmail(), s.getPassword())) {
		 
		 result.rejectValue("password", "error.form", "Invalid email or password");
	     
		 if (result.hasErrors()) {
	            return "login";
	        } 
	 
}
	 return "redirect:/dashboard";
}
@GetMapping("/dashboard")
public ModelAndView dashboard() {
	 ModelAndView mv = new ModelAndView();

	 mv.setViewName("dashboard");
	 return mv;
}
}