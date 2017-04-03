package net.divine.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequsetParam {
	
	@RequestMapping(value = "/carForm", method = RequestMethod.GET)
	public ModelAndView getStudentForm() {
		ModelAndView model = new ModelAndView("CarsForm");
		return model;
	}

	@RequestMapping(value = "/carSuccess", method = RequestMethod.POST)
	public ModelAndView submitStudentForm(@RequestParam Map<String, String> parametrs) {
		String car = parametrs.get("car");
		String color = parametrs.get("color");
		ModelAndView model = new ModelAndView("CarsSuccess");
		model.addObject("msg", "New " + car + " with " + color + " color");
		return model;
	}
}
