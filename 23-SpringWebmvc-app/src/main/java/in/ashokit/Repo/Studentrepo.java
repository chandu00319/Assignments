package in.ashokit.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Student;

public interface Studentrepo extends JpaRepository<Student, Integer> {

	
	public Student findByEmail(String email);
}
