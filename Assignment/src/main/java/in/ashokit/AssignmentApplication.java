package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.Empservice;

@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AssignmentApplication.class, args);
		
		Empservice empservice = context.getBean(Empservice.class);
		empservice.insertEmployeeRecords();
	}

}
