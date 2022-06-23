package ch05.home.ex05.case08;

public class Person {

	private String name;

	private boolean hasBall;

	public Person(String name) {
		super();
		this.name = name;
	}

	public void shut() {

	}

	public void pass(Person person) {
		this.hasBall = false;
		person.hasBall = true;
	}

	public boolean isHasBall() {
		return hasBall;
	}

	public void setHasBall(boolean hasBall) {
		this.hasBall = hasBall;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
