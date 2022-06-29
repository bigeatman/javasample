package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic {
	public static final int VOLTEAGE = 200;
	static final String MAKER_NAME = "LG";
	final int WEIGHT = 10;
	LocalDate PRODUCED_DATE = LocalDate.now();
	// public static final가 자동으로 붙는다.
	
	public abstract void displayMsg();
	abstract int getTemperature();
	String getModelName();
	// 추상메서드 선언 시 public abstract가 자동으로 붙는다.
}
