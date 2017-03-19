package com.cisc181.core;

import java.util.regex.Pattern;

import com.cisc181.core.Person;
public class PersonException extends Person {
	public PersonException(){
		super();
		this.getDOB();
		this.getPhone();
		
		String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		Pattern pattern = Pattern.compile(regex);
		
	}
	

}
