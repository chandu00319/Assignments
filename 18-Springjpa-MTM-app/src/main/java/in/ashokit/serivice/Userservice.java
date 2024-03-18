package in.ashokit.serivice;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Roles;
import in.ashokit.entity.Users;
import in.ashokit.repo.Rolesrepo;
import in.ashokit.repo.UserRepo;

@Service
public class Userservice {

	@Autowired
	private UserRepo userrepo;
	@Autowired
	private Rolesrepo rolesrepo;
	
	
	public void saveUserWithRoles() {

		Roles r1 = new Roles();
		r1.setRname("Testing");

		Roles r2 = new Roles();
		r2.setRname("Developer");

		Users user = new Users();
		user.setName("Chandu");
		user.setGender("Male");

		user.setRoles(Arrays.asList(r1, r2));

		userrepo.save(user);

	}
	
}
