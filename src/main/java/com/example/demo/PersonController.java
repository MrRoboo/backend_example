package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RestController
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	public Optional<Person> vindEentje (@PathVariable int mijnid) {
		return service.vindEentje(mijnid);
	}
	
	@RequestMapping(value = "/persons")
	public List<Person> find(){
		return service.SearchForPersons();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/maakpersoonaan")
	public Person maakPersoonAan(@RequestBody Person person) {
		return service.maakPersoonAan(person);
	}

}
