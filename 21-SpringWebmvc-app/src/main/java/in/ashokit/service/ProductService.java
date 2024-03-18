package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;
import in.ashokit.repo.Productrepo;

@Service
public class ProductService 
{

	@Autowired
	private Productrepo repo;
	
	
	public boolean saveproduct(Product p ) {
		
		repo.save(p);
		return true;
		
	
	}
	public List<Product> getproduct() {
		List<Product> list = repo.findAll();
		return list;
	}
}
