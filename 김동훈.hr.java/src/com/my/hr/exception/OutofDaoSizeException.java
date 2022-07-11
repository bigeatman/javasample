package com.my.hr.exception;

public class OutofDaoSizeException extends Exception {

	/** serialVersionUID */
	private static final long serialVersionUID = -6734971477119139800L;

	/** Exception message format */
	private static final String OUT_OF_DAO_SIZE = "������ �� �ִ� �ִ� �뵿�� ���� �ʰ��߽��ϴ�.";

	/**
	 * Constructor
	 * 
	 */
	public OutofDaoSizeException() {
		super(OUT_OF_DAO_SIZE);
	}
}
