package org.proco.macro.net;

import java.util.ArrayList;
import java.util.List;

public class LessonInfo {

	private String targetLessionID;

	private int targetLessonIndex;

	private final List<String> anotherLessions;

	public LessonInfo() {
		super();
		anotherLessions = new ArrayList<>();
	}

	public String getTargetLessionID() {
		return targetLessionID;
	}

	public void setTargetLessionID(String targetLessionID) {
		this.targetLessionID = targetLessionID;
	}

	public void addLession(String lessionFullValue) {
		anotherLessions.add(lessionFullValue);
	}

	public int getLessionCount() {
		return anotherLessions.size();
	}

	public int getTargetLessonIndex() {
		return targetLessonIndex;
	}

	public void setTargetLessonIndex(int targetLessonIndex) {
		this.targetLessonIndex = targetLessonIndex;
	}
}
