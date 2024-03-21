package in.ashokit.service;

import in.ashokit.entity.Student;

public interface StudentService {

	public boolean saveemps(Student s);
	public void sendEmail(String to, String subject, String text);
	
	public Student findByEmail(String email);
	public boolean validateUser(String email, String password);
	
}
