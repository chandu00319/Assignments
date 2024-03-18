package in.ashokit;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.itextpdf.text.DocumentException;

import in.ashokit.service.UserService;

@SpringBootApplication
public class Assignment3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Assignment3Application.class, args);
		
		UserService service = context.getBean(UserService.class);
		//service.saveuser();
		/*
		try {
			service.exportDataToPdf("S:\\assig\\user.pdf");
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
        context.close();
        */
		
		try {
			service.exportDataToExel("S:\\assig\\users.xlsx");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    context.close();
    }
	}


