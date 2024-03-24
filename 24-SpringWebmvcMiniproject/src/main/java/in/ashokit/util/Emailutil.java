package in.ashokit.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class Emailutil {
	@Autowired
	private JavaMailSender javaMailSender;
	
	public boolean sendmail(String to,String subject,String text) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		try {
	        message.setTo(to);
	        message.setSubject(subject);
	        message.setText(text);
	        javaMailSender.send(message);
	    
		return true;
	}catch(Exception e) {
		e.printStackTrace();
		return false;
	}
	
	}
}
