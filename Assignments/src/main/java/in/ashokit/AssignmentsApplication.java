package in.ashokit;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.Service.EmpService;

@SpringBootApplication
public class AssignmentsApplication {

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext context = SpringApplication.run(AssignmentsApplication.class, args);
		
		EmpService bean = context.getBean(EmpService.class);
		
		String pdfPath="S:\\Spring boot\\PAN Card.pdf";
		String photoPath="S:\\Spring boot\\chandu.JPG";
		
		//bean.save(pdfPath, photoPath);
		bean.HQLMethods();
	}

}
