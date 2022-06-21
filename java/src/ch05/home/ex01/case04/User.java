package ch05.home.ex01.case04;

import java.time.LocalDate;

public class User {

	private String name;

	private int age;

	private LocalDate regDate;

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.regDate = LocalDate.now();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

}
