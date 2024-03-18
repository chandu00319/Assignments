package in.ashokit.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.Entity.Employe;

public interface EmployeRepo extends JpaRepository<Employe, Integer>{

	
	@Query("from Employe")
	public List<Employe> getDetails();
	
	
	@Query("select e.name,e.salary from Employe e")
	public List<Object[]> getEmpsnameAndsalary();
}
