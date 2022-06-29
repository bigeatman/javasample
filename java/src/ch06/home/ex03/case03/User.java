package ch06.home.ex03.case03;

public class User {

	public int age;
	public String name;

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
