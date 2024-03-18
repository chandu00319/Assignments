package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.entity.Product;
import in.ashokit.service.ProductService;

@Controller
public class ProductController {
@Autowired
	private ProductService service;

	@GetMapping("/products")
	public ModelAndView loadform() {
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("getproducts",new Product());
		mv.setViewName("index");
		return mv;
	}
	@PostMapping("/products")
	public ModelAndView handleUserFormSubmit(Product product) {
	boolean saveproduct = service.saveproduct(product);	
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Product Saved Sucessfully");
		mav.addObject("getproducts", new Product());
		mav.setViewName("index");
		
		return mav;
	}
	@GetMapping("/Allproducts")
	public ModelAndView getproducts(){
		
		
		List<Product> list = service.getproduct();
		ModelAndView mv=new ModelAndView();
		mv.addObject("getemps1",list);
		mv.setViewName("sucess");
	
		return mv;
		
	}
	
	
}
