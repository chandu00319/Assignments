package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.Entity.Emp;
import in.ashokit.repo.Emprepo;

@Service
public class EmpService {
@Autowired
	private Emprepo repo;

public List<Emp> getemps() {
	
	return repo.findAll();
	
	
}
}
