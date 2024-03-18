package in.ashokit.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.Entity.Address;

public interface Addrepo extends JpaRepository<Address, Integer> {

	
}

