package in.ashokit.Repo;


import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Employees;

public interface Emprepo extends JpaRepository<Employees, String> {

}
