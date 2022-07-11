package org.proco.school.model;

import org.proco.school.model.parent.Tuple;

public class Class extends Tuple {

	private String name;

	private Professor professor;

	private int max;

	private int score;

	private String targetSeason;

	public Class() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getTargetSeason() {
		return targetSeason;
	}

	public void setTargetSeason(String targetSeason) {
		this.targetSeason = targetSeason;
	}

}
