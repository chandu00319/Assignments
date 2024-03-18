

package in.ashokit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.Entity.Emp;
import in.ashokit.service.EmpService;

@Controller
public class WebController {

	@Autowired
	private EmpService service;
	
	@GetMapping("/emps")
	public ModelAndView getemps() {
		
		List<Emp> getemps = service.getemps();
		ModelAndView mv=new ModelAndView();
		mv.addObject("getemps1",getemps);
		mv.setViewName("index");
		
		return mv;
	
	}
	
	
	@GetMapping("/welcome")
	public ModelAndView getmsg() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg","Hello good morning");
		mv.setViewName("index");
		
		return mv;
	}
}
