package com.my.hr.exception;

public class EmployerIdNotFoundException extends Exception {

	/** serialVersionUID */
	private static final long serialVersionUID = 3090648496246205609L;

	/** Exception message format */
	private static final String ID_NOT_FOUND_FORMAT = "존재하지 않는 ID";

	/**
	 * Constructor
	 * 
	 * @param id target Employer id
	 */
	public EmployerIdNotFoundException(int id) {
		super(String.format(ID_NOT_FOUND_FORMAT, id));
	}
}
