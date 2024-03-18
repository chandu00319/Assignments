package in.ashokit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.Entity.Address;
import in.ashokit.Entity.Emp;
import in.ashokit.Repo.Addrepo;
import in.ashokit.Repo.Emprepo;
import jakarta.transaction.Transactional;

@Service
public class Services {
	@Autowired
	private Emprepo emprepo;
	@Autowired
	private Addrepo addrrepo;
	
	
	
	public void methods() {
		//List<Object[]> list = emprepo.getemps();
		//list.forEach(s->System.out.println(s));
		List<Object[]> list = emprepo.InnerJoin();
		
		for (Object[] result : list) {
			 Integer eid = (Integer) result[0];
	            Double salary = (Double) result[1];
	            String name = (String) result[2];
	            Integer id = (Integer) result[3];
	            String dist = (String) result[4];
	            String state = (String) result[5];
	            String city = (String) result[6];

	            // Print the values to the console
	            System.out.println("eid: " + eid + ", salary: " + salary + ", name: " + name + ", id: " + id + ", dist: " + dist + ", state: " + state + ", city: " + city);
	        }
		
	}

	@Transactional(rollbackOn = Exception.class)
	public void saveemp() {
		Emp e=new Emp();
		e.setName("hari");
		e.setSalaray(10000.00);
		Emp emp = emprepo.save(e);
		
		System.out.println(emp);
		
		Address a=new Address();
		
		a.setCity("karnool");
		a.setDist("karnool");
		a.setState("Ap");
		a.setEid(emp.getEid());
		Address save = addrrepo.save(a);
		System.out.println(save);
		
	}
}
