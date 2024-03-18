package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.Service.Services;

@SpringBootApplication
public class Assignments2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Assignments2Application.class, args);
		
		Services bean = context.getBean(Services.class);
		
		//bean.saveemp();
		bean.methods();
	}

}
