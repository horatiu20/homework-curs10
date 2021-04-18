package ro.fasttrackit.exercise3;

import java.util.HashSet;
import java.util.Set;

/*Create a Person(name, age, position).
Create an object that models a Company 1 manager, the rest are welders, carpenters, plumbers.
- getManager(): Person                          - checks all persons and returns the one with position "manager"
- getPersons(String profession):List<Person>    - returns all the persons that have the received profession
- getPersonsOlder(int age): List<Person>        - returns all the persons that are older than received age
- getPerson(String filterName):List<Person>     - returns all the persons that have names that contains the received string
- employ(Person)                                - employs a person. Adds it to the list of persons*/

public class Main {
	public static void main(String[] args) {
		Set<Employee> person = new HashSet<>();
		person.add(new Employee("Horatiu", 35, "manager"));
		person.add(new Employee("Mihai", 41, "welder"));
		person.add(new Employee("Bianca", 30, "carpenter"));
		person.add(new Employee("Iancu", 55, "plumber"));

		System.out.println("Manager:");
		for (Employee all : person) {
			if (all.getPosition().equals("manager")) {
				System.out.println(all.getName());
			}
		}
		System.out.println("Plumber:");
		for (Employee all : person) {
			if (all.getPosition().equals("plumber")){
				System.out.println(all.getName());
			}
		}
	}
}
