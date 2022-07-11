package com.my.hr.presentation;

import java.util.Scanner;

import com.my.hr.literals.StringLiterals;
import com.my.hr.service.ServiceHandler;

public class ProgramHandler {

	/** instance for singleton pattern */
	private static ProgramHandler instance;

	/** Scanner instance for processing user input */
	private final Scanner scan;

	/** Service handler for processing functions */
	private final ServiceHandler serviceHandler;

	/**
	 * return the singleton instance
	 * 
	 * @return singleton instance
	 */
	public static ProgramHandler getInstance() {
		if (instance == null) {
			instance = new ProgramHandler();
		}

		return instance;
	}

	/**
	 * Constructor
	 */
	private ProgramHandler() {
		super();
		scan = new Scanner(System.in);
		serviceHandler = ServiceHandler.getInstance();
	}

	/**
	 * print the menu and return the menu number by user input
	 * 
	 * @return selected menu number
	 */
	public int selectMenu() {
		System.out.println(StringLiterals.MAIN_MENU);
		System.out.print(StringLiterals.CHAR_USER_INPUT);

		try {
			return checkInputIsValid();
		} catch (NumberFormatException e) {
			System.out.println(StringLiterals.NUMBER_FORMAT_EXCEPTION_MSG);
			return selectMenu();
		}
	}

	/**
	 * check the input is not invalid. <br>
	 * this method'll rerun the selectMenu() Method if input is not valid.
	 * 
	 * @return selected menu number
	 */
	private int checkInputIsValid() {
		String selectedStr = scan.nextLine();
		int selected = Integer.parseInt(selectedStr);

		if (!(1 <= selected && selected <= 5)) {
			System.out.println(StringLiterals.INVALID_SELECTED_MENU_MSG);
			return selectMenu();
		} else {
			return selected;
		}
	}

	/**
	 * print the all Employer to console.
	 */
	public void printAllEmployer() {
		serviceHandler.printAllEmployer();
	}

	/**
	 * add the Employer.
	 */
	public void addEmployer() {
		serviceHandler.addEmployer(scan);
	}

	/**
	 * modify the Employer
	 */
	public void modifyEmployer() {
		serviceHandler.modify(scan, false);
	}

	/**
	 * remove the Employer
	 */
	public void removeEmployer() {
		serviceHandler.modify(scan, true);
	}
}
