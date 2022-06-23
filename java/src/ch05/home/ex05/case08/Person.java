package ch05.home.ex05.case08;

public class Person {

	private String name;

	private boolean hasBool;

	public Person(String name) {
		super();
		this.name = name;
	}

	public void shut() {

	}

	public void pass(Person person) {
		this.hasBool = false;
		person.hasBool = true;
	}

	public boolean isHasBool() {
		return hasBool;
	}

	public void setHasBool(boolean hasBool) {
		this.hasBool = hasBool;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
