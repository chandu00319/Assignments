package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.Entity.User;

public interface Userrepo extends JpaRepository<User, Integer> {

}
