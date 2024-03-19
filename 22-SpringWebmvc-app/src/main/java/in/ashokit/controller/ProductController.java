package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.entity.Product;
import in.ashokit.service.ProductService;
@Controller
public class ProductController {

	@Autowired
	private ProductService service;
	@GetMapping("/")
	public ModelAndView loadForm( ) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("product",new Product());
		mv.setViewName("index");
		return mv;
	}
	
	@PostMapping("/produts")
	public ModelAndView saveProduct(Product p) {
		ModelAndView mv=new ModelAndView();
		boolean products = service.saveProducts(p);
		if(products) {
			mv.addObject("msg","Data Entered Suceess fully");
		}else {
			mv.addObject("msg1","Error");
		}
		mv.addObject("product",new Product());
		mv.setViewName("index");
		
		return mv;
	}
	@GetMapping("/productlist")
	public ModelAndView getAllProducts() {
		ModelAndView mv=new ModelAndView();
		List<Product> getproducts = service.getproducts();
		mv.addObject("get",getproducts);
		mv.setViewName("data");
		return mv;
	}
	/*
	@GetMapping("/delete/{id}")
	public ModelAndView deleteproduct(@PathVariable("id") Integer id) {
		ModelAndView mv=new ModelAndView("redirect:/");
		 try {
			 
			 service.deletebyid(id); 
		        mv.addObject("msg", "Product deleted successfully");
		    } catch (Exception e) {
		        mv.addObject("msg", "Product not found");
		    }
		
		
		
		return mv;
	
}*/
	@GetMapping("/delete/{id}")
	public ModelAndView deleteproduct(@PathVariable("id") Integer id) {
		ModelAndView mv=new ModelAndView();
		 try {
			 
			 service.deletebyid(id); 
		        mv.addObject("msg", "Product deleted successfully");
		    } catch (Exception e) {
		        mv.addObject("msg", "Product not found");
		    }	 
		 List<Product> getproducts = service.getproducts();
			mv.addObject("get",getproducts);
		 
		mv.setViewName("data");	
		return mv;
	
}
	@GetMapping("/edit/{id}")
	public ModelAndView showEditForm(@PathVariable("id") Integer id) {
	    ModelAndView mv = new ModelAndView();
	    Product product = service.getProductById(id);
	    mv.addObject("product", product);
	    mv.setViewName("edit");
	    return mv;
	}
	
	@PostMapping("/edit/{id}")
	public ModelAndView editProduct(@PathVariable("id") Integer id, Product p) {
	    ModelAndView mv = new ModelAndView();
	    try {
	      service.saveProducts(p);
	        mv.addObject("msg", "Product edited successfully");
	    } catch (Exception e) {
	        mv.addObject("msg", "Error editing product");
	    }
	    mv.addObject("product",new Product());
	    mv.setViewName("edit");
	    return mv;
	}

}