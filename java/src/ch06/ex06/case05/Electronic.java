package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic {
	public static final int VOLTEAGE = 200;
	static final String MAKER_NAME = "LG";
	final int WEIGHT = 10;
	LocalDate PRODUCED_DATE = LocalDate.now();
	// public static final�� �ڵ����� �ٴ´�.
	
	public abstract void displayMsg();
	abstract int getTemperature();
	String getModelName();
	// �߻�޼��� ���� �� public abstract�� �ڵ����� �ٴ´�.
}