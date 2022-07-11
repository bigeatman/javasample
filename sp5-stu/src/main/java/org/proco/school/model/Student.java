package org.proco.school.model;

import java.time.LocalDate;

public class Student extends Professor {

	private int grade;

	public Student() {
		super();
	}

	public Student(long id, String name, LocalDate birth, int grade) {
		super(id, name, birth);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return String.format("%d %s %d %s", this.getId(), this.getName(), grade, this.getBirth());
	}
}
