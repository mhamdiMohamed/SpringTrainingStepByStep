package com.med;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.med.data.Person;

import org.springframework.ui.ModelMap;

@Controller
public class PersonController {

	@RequestMapping(value = "/person", method = RequestMethod.GET)
	public ModelAndView person() {
		return new ModelAndView("person", "command", new Person());
	}	

	@RequestMapping(value = "/addPerson", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("SpringWeb") Person person, ModelMap model) {
		model.addAttribute("name", person.getName());
		model.addAttribute("age", person.getAge());
		model.addAttribute("id", person.getId());
		return "result";
	}
}