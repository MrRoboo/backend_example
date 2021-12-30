package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

	@Autowired
	private IAddressRepo repository;
	
	public List<Address> searchForAddresses(){
		List<Address> addressList = repository.findAll();
		
		return addressList;
	}
	
	public Address createAddress(Address address) {
		return repository.save(address);
	}
	// TODO createAddress
}
