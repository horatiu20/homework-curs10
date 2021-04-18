package ro.fasttrackit.exercise3;

public class Person implements Company {
	private final String name;
	private final int age;
	private String position;
	private String profession;

	public Person(String name, int age, String position, String profession) {
		this.name = name;
		this.age = age;
		this.position = position;
		this.profession = profession;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Override
	public String getManager() {
		return this.position;
	}

	@Override
	public String getPersons() {
		return this.profession;
	}

	@Override
	public String getPersonsOlder() {
		return this.name;
	}

	@Override
	public String getPerson() {
		return this.name;
	}
}
