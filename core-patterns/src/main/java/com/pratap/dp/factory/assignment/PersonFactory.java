package com.pratap.dp.factory.assignment;

public class PersonFactory {

	public static Person createPerson(String type) {
		Person person = null;
		
		if(type.equals("M")) {
			person = new Male();
		} else if(type.equals("F")) {
			person = new Female();
		}
		
		return person;
	}
}
