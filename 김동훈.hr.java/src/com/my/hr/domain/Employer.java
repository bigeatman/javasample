package com.my.hr.domain;

import java.time.LocalDate;

import com.my.hr.literals.StringLiterals;

public class Employer {

	/** Employer id */
	private final int id;

	/** Employer name */
	private String name;

	/** Employer regDate */
	private LocalDate regDate;

	/**
	 * Constructor
	 * 
	 * @param id Employer id
	 */
	public Employer(int id) {
		super();
		this.id = id;
	}

	/**
	 * return Employer id
	 * 
	 * @return Employer id
	 */
	public int getId() {
		return id;
	}

	/**
	 * return Employer name
	 * 
	 * @return Employer name
	 */
	public String getName() {
		return name;
	}

	/**
	 * set the Employer name
	 * 
	 * @param name Employer name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * return Employer registered date
	 * 
	 * @return Employer registered date
	 */
	public LocalDate getRegDate() {
		return regDate;
	}

	/**
	 * set the Employer registered date
	 * 
	 * @param regDate Employer registered date
	 */
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	/**
	 * convert the Employer to string
	 */
	@Override
	public String toString() {
		return String.format(StringLiterals.EMPLOYER_TOSTR_FORMAT, id, name, regDate);
	}
}
