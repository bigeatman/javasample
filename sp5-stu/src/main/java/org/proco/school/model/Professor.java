package org.proco.school.model;

import java.time.LocalDate;

import org.proco.school.model.parent.Tuple;

public class Professor extends Tuple {

	private String name;

	private LocalDate birth;

	public Professor() {
		super();
	}

	public Professor(long id, String name, LocalDate birth) {
		super(id);
		this.name = name;
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

}
