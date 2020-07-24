package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	public String firstName;
	public String lastName;

	public String Country;
	private LinkedHashMap<String,String> countryOptions;

	public Student() {
		countryOptions=new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("USA", "America");
		countryOptions.put("TR", "TURKEY");
		countryOptions.put("Rus", "Russian");
		
	}
	
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}


	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
