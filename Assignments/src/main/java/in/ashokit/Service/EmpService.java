package in.ashokit.Service;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.Entity.Employe;
import in.ashokit.Repository.EmployeRepo;
@Service
public class EmpService {

	@Autowired
	private EmployeRepo repo;
	
	
	
	public void HQLMethods() {
		//List<Employe> list = repo.getDetails();
		//list.forEach(e->System.out.println(e));
		List<Object[]> list = repo.getEmpsnameAndsalary();
		for(Object[] l:list) {
			String name = (String) l[0]; // Assuming name is of type String
		    Double salaryDouble = (Double) l[1]; // Assuming salary is of type Double
		    BigDecimal salary = BigDecimal.valueOf(salaryDouble);
		    System.out.println(name  + salary);
		}
		}
		
	
	
	public void save(String photoPath, String pdfPath) throws IOException {
		Employe e=new Employe();
		
		e.setName("Raju");
		byte[] ImageBytes=Files.readAllBytes(Paths.get(photoPath));
		byte[] resumeBytes=Files.readAllBytes(Paths.get(pdfPath));
		e.setPdf(resumeBytes);	
		e.setPhoto(ImageBytes);
		e.setSalary(4000.00);
		repo.save(e);
	}
	
}
