package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import in.ashokit.Repo.Studentrepo;
import in.ashokit.entity.Student;
@Service
public class IStudentService implements StudentService {
@Autowired
	private Studentrepo repo;
@Autowired
private JavaMailSender javaMailSender;
	@Override
	public boolean saveemps(Student s) {
		Student student = repo.save(s);
		
		return student.getId()!=null;
	}
	@Override
	public void sendEmail(String to, String subject, String text) {
		try {
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setFrom("noreply@baeldung.com");
	        message.setTo(to);
	        message.setSubject(subject);
	        message.setText(text);
	        javaMailSender.send(message);
	        System.out.println("Email sent successfully to: " + to);
	    } catch (Exception e) {
	        System.out.println("Failed to send email: " + e.getMessage());
	    }

		
		
	}
	@Override
	public Student findByEmail(String email) {
	
		return repo.findByEmail(email);
	}
	@Override
	public boolean validateUser(String email, String password) {	
		Student student = findByEmail(email);	
		return  student != null && student.getPassword().equals(password);
	}
}
