package ro.fasttrackit.exercise3;

/*Create a Person(name, age, position).
Create an object that models a Company 1 manager, the rest are welders, carpenters, plumbers.
- getManager(): Person                          - checks all persons and returns the one with position "manager"
- getPersons(String profession):List<Person>    - returns all the persons that have the received profession
- getPersonsOlder(int age): List<Person>        - returns all the persons that are older than received age
- getPerson(String filterName):List<Person>     - returns all the persons that have names that contains the received string
- employ(Person)                                - employs a person. Adds it to the list of persons*/

public interface Company {
	String getManager();

	String getPersons();

	String getPersonsOlder();

	String getPerson();

}
