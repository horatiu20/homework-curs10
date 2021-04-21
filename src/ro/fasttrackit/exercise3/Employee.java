package ro.fasttrackit.exercise3;

public class Employee implements Person {
	private final String name;
	private final int age;
	private String position;

	public Employee(String name, int age, String position) {
		this.name = name;
		this.age = age;
		this.position = position;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}