package ro.fasttrackit.exercise3;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Person> person = new HashSet<>();
		person.add(new Person("Horatiu", 35, "manager", "engineer"));
		person.add(new Person("Mihai", 41, "welder", "unqualified worker"));
		person.add(new Person("Bianca", 30, "carpenter", "artist"));
		person.add(new Person("John", 55, "plumber", "unqualified worker"));

	}
}
