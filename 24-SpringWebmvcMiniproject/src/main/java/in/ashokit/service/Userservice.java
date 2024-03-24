package in.ashokit.service;

import in.ashokit.entity.User;

public interface Userservice {

	public boolean saveusers(User user);
	
	public User getusers(String email,String pwd);
}
