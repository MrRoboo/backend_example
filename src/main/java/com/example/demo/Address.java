package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Adressen")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String postcode;
	private String straatnaam;
	private String huisnummer;
	private String plaats;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getStraatnaam() {
		return straatnaam;
	}
	public void setStraatnaam(String straatnaam) {
		this.straatnaam = straatnaam;
	}
	public String getHuisnummer() {
		return huisnummer;
	}
	public void setHuisnummer(String huisnummer) {
		this.huisnummer = huisnummer;
	}
	public String getPlaats() {
		return plaats;
	}
	public void setPlaats(String plaats) {
		this.plaats = plaats;
	}
	
	
}
