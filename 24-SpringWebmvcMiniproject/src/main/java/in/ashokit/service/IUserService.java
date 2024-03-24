package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repo.Userrepo;
import in.ashokit.util.Emailutil;
@Service
public class IUserService implements Userservice {

	@Autowired
	private Userrepo repo;
	@Autowired
	private Emailutil util;
	
	@Override
	public boolean saveusers(User user) {	
		User user2 = repo.save(user);
		if(user2!=null) {
			String subject="welcome to Ashokit";
			String text="Thanks for register..!";
			util.sendmail(user2.getEmail(),subject , text);
		}
			return true;
		}
	

	@Override
	public User getusers(String email, String pwd) {
		
		User user = repo.findByEmailAndPwd(email, pwd);
		
		return user;
	}

}
