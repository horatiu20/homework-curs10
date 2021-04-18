package ro.fasttrackit.exercise3;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Employee> person = new HashSet<>();
		person.add(new Employee("Horatiu", 35, "manager"));
		person.add(new Employee("Mihai", 41, "welder"));
		person.add(new Employee("Bianca", 30, "carpenter"));
		person.add(new Employee("John", 55, "plumber"));

		System.out.println("Manager");
		for (Employee all : person) {
			if (all.getPosition() == "manager") {
				System.out.println(all);
			}
		}
		System.out.println("Plumber");

	}
}
