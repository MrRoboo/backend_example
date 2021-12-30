package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RestController
public class AddressController {
	
	@Autowired
	private AddressService service;
	
	@RequestMapping(value = "/Addresses")
	public List<Address> find(){
		return service.searchForAddresses();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/createAddress")
	public Address createAddress(@RequestBody Address address) {
		return service.createAddress(address);
	}
	
}
