package base;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import com.github.javafaker.Faker;

public class Training extends Object {

	private int count = 1;

	public Training() {
		super();
	}

	public void listItems() {

		List<Person> people = new ArrayList<>();
		int x = 1000;
		while (x > 0) {
			@SuppressWarnings("deprecation")
			Faker faker = new Faker(new Locale("pt-BR"));
			String name = faker.name().fullName();
			String streetAddress = faker.address().streetAddress();
			String age = Integer.toString(faker.number().numberBetween(18, 100));
			people.add(new Person(name, age, streetAddress));
			x--;
		}

		/**
		 * List<Person> richPeople = new ArrayList<>(); for(Person p: people) {
		 * if(p.billions>=100) richPeople.add(p); } richPeople.forEach(person ->
		 * System.out.println("RICH PERSON: " + person.name));
		 ***/

		List<Person> richPeople = people.stream()
				// .filter(person -> person.age < 100)
				.sorted(Comparator.comparing(person -> person.name)).collect(Collectors.toList());

		richPeople.forEach(person -> System.out.println("##" + count++ + " \nPERSON NAME: " + person.name + "\nAGE: "
				+ person.age + "\nADDRESS: " + person.address + "\n")
				);
	}
	
	public static void main(String[] args) {
		new Training().listItems();
	}

	private class Person {
		private String name;
		private String age;
		private String address;

		Person(String name, String age, String address) {
			setName(name);
			setAge(age);
			setAddress(address);
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}
	}
}
