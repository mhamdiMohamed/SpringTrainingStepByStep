package com.med;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.med.data.Person;
import com.med.data.PersonJDBCTemplate;

import org.springframework.ui.ModelMap;

@Controller
public class PersonController {

	private PersonJDBCTemplate personJDBCTemplate;
	
	public PersonController() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		personJDBCTemplate = (PersonJDBCTemplate) applicationContext.getBean("personJDBCTemplate");
	}

	@RequestMapping(value = "/person", method = RequestMethod.GET)
	public ModelAndView person() {
		return new ModelAndView("person", "command", new Person());
	}

	@RequestMapping(value = "/addPerson", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("SpringWeb") Person person, ModelMap model) {
		personJDBCTemplate.create(person);

		model.addAttribute("name", person.getName());
		model.addAttribute("age", person.getAge());
		model.addAttribute("id", person.getId());
		model.addAttribute("Activity", "Added");
		return "result";
	}

	@RequestMapping(value = "/personid", method = RequestMethod.GET)
	public ModelAndView personId() {
		return new ModelAndView("personid", "command", new Person());
	}

	@RequestMapping(value = "/removePerson", method = RequestMethod.POST)
	public String removePerson(@ModelAttribute("SpringWeb") Person id, ModelMap model) {
		Person person = personJDBCTemplate.getPerson(id.getId());
		personJDBCTemplate.delete(id.getId());

		model.addAttribute("name", person.getName());
		model.addAttribute("age", person.getAge());
		model.addAttribute("id", person.getId());
		model.addAttribute("Activity", "Removed");
		return "result";
	}

	@RequestMapping(value = "/personslist", method = RequestMethod.GET)
	public String printPersonsList(ModelMap model) {
		List<Person> persons = personJDBCTemplate.listPersons();
		model.addAttribute("persons", persons.toString());
		return "personslist";
	}
}