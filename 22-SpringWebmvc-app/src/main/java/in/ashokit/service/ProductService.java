package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Product;

public interface ProductService {

	
	public boolean saveProducts(Product p);
	public List<Product> getproducts();
	
	public void deletebyid(Integer id);
	
	 public Product getProductById(Integer id);
}
