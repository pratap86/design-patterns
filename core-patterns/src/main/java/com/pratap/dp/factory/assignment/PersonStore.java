package com.pratap.dp.factory.assignment;

public class PersonStore {

	public Person orderPerson(String type) {
		Person person = PersonFactory.createPerson(type);
		person.wish("Hello");
		
		return person;
	}
}
