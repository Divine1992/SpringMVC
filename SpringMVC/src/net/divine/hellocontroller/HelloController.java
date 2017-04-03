package net.divine.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{
	
	@RequestMapping("/welcome/{country}/{userName}")
	public ModelAndView helloWorld(@PathVariable Map<String, String> vars) {
		String name = vars.get("userName");
		String country = vars.get("country");
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hello "+ name + " from " + country);
		return model;
	}
}
