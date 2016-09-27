package de.dc.databinding.rcp.model;

import java.util.ArrayList;
import java.util.List;

public class PersonModelProvider {

	private List<Person> persons = new ArrayList<Person>();
	
	public PersonModelProvider() {
		persons.add(create(1, "Peter", "1111"));
		persons.add(create(2, "Maria", "2222"));
		persons.add(create(3, "James", "3333"));
		persons.add(create(4, "Walter", "4444"));
		persons.add(create(5, "Toni", "5555"));
		persons.add(create(6, "Jackson", "6666"));
	}

	private Person create(int age, String name, String numner) {
		Person person = new Person();
		person.setAge(age);
		person.setName(name);
		person.setNumner(numner);
		return person;
	}
	
	public List<Person> getPersons(){
		return persons;
	}
}
