package com.my.hr.exception;

public class InvaildNameLengthException extends Exception {

	/** serialVersionUID */
	private static final long serialVersionUID = 3055674648341532414L;

	/** Exception message format */
	private static final String INVALID_NAME_LENGTH = "이름은 5자 이하여야 합니다.";

	/**
	 * Constructor
	 */
	public InvaildNameLengthException() {
		super(INVALID_NAME_LENGTH);
	}
}
