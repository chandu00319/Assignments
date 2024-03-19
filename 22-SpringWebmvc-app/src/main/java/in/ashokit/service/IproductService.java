package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;
import in.ashokit.repo.Productrepo;
@Service
public class IproductService implements ProductService {
	
	@Autowired
	private Productrepo repo;
	

	@Override
	public boolean saveProducts(Product p) {
		
		Product product = repo.save(p);
		return product.getId() != null;
	}

	@Override
	public List<Product> getproducts() {
		// TODO Auto-generated method stub
		
		
		return repo.findAll();
	}

	
	public void deletebyid(Integer id) {
		repo.deleteById(id);
	}
	@Override
	public Product getProductById(Integer id) {
		 Optional<Product> optionalProduct = repo.findById(id);
	        return optionalProduct.orElse(null);
		
	}
}
