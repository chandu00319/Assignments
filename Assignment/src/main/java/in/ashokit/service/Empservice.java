package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.Repo.Emprepo;
import in.ashokit.entity.Employees;

@Service
public class Empservice {
@Autowired
	private Emprepo repo;

public void insertEmployeeRecords() {
    Employees employee1 = new Employees();
    employee1.setName("Chandu");
    employee1.setSalary(100000.00);
    repo.save(employee1);

    Employees employee2 = new Employees();
    employee2.setName("Raju");
    employee2.setSalary(20000.00);
    repo.save(employee2);
}


}
