package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.Entity.Emp;
import in.ashokit.service.EmpService;

public interface Emprepo extends JpaRepository<Emp, Integer> {

}
