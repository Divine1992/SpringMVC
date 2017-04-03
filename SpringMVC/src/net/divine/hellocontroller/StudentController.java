package net.divine.hellocontroller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		//binder.setDisallowedFields(new String[] {"mobile"});  			//hide "mobile" property
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class, "DOB", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "name", new StudentNameEditor());
	}

	@RequestMapping(value = "/admissionForm", method = RequestMethod.GET)
	public ModelAndView getStudentForm() {
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}

	@ModelAttribute
	public void addModelAttribute(Model model) {
		model.addAttribute("msg", "Kyiv military scholl");
	}

	@RequestMapping(value = "/admissionSuccess", method = RequestMethod.POST)
	public ModelAndView submitStudentForm(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		if (result.hasErrors()) {
			ModelAndView model = new ModelAndView("AdmissionForm");
			return model;
		}
		ModelAndView model = new ModelAndView("AdmissionSucces");
		return model;
	}
}
