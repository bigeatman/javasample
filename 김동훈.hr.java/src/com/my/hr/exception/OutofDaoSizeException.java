package com.my.hr.exception;

public class OutofDaoSizeException extends Exception {

	/** serialVersionUID */
	private static final long serialVersionUID = -6734971477119139800L;

	/** Exception message format */
	private static final String OUT_OF_DAO_SIZE = "저장할 수 있는 최대 노동자 수를 초과했습니다.";

	/**
	 * Constructor
	 * 
	 */
	public OutofDaoSizeException() {
		super(OUT_OF_DAO_SIZE);
	}
}
