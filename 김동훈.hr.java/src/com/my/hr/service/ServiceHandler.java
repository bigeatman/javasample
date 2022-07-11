package com.my.hr.service;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Scanner;
import java.util.regex.Matcher;

import com.my.hr.dao.EmployerDao;
import com.my.hr.domain.Employer;
import com.my.hr.exception.EmployerIdNotFoundException;
import com.my.hr.exception.InvaildNameLengthException;
import com.my.hr.exception.OutofDaoSizeException;
import com.my.hr.literals.StringLiterals;

public class ServiceHandler {

	/** instance for singleton pattern */
	private static ServiceHandler instance;

	/** instance for management the Employees */
	private final EmployerDao dao;

	/**
	 * return the singleton instance
	 * 
	 * @return singleton instance
	 */
	public static ServiceHandler getInstance() {
		if (instance == null) {
			instance = new ServiceHandler();
		}

		return instance;
	}

	/**
	 * Constructor
	 */
	private ServiceHandler() {
		super();
		dao = new EmployerDao();
	}

	/**
	 * print the all Employer to console.
	 */
	public void printAllEmployer() {
		System.out.println(StringLiterals.SEPARATOR);
		System.out.println(StringLiterals.EMPLOYER_PRINTALL_HEADER);
		System.out.println(StringLiterals.SEPARATOR);

		Collection<Employer> list = dao.selectAll();

		for (Employer emp : dao.selectAll()) {
			System.out.println(emp);
		}

		System.out.println(StringLiterals.SEPARATOR);
		System.out.println(StringLiterals.EMPLOYER_TOTAL_COUNT + list.size());
		System.out.println(StringLiterals.SEPARATOR);
	}

	/**
	 * add the Employer.
	 * 
	 * @param scan scanner instance for user input
	 */
	public void addEmployer(Scanner scan) {
		try {
			String name = getUserInput(scan, StringLiterals.INPUT_NAME);
			String regDateStr = getUserInput(scan, StringLiterals.INPUT_REGDATE);

			LocalDate regDate = toRegDate(regDateStr);
			dao.insert(name, regDate);
		} catch (OutofDaoSizeException e) {
			System.out.println(e.getMessage());
		} catch (InvaildNameLengthException e) {
			System.out.println(e.getMessage());
		} catch (DateTimeException e) {
			System.out.println(StringLiterals.REG_DATE_INVALID);
		}
	}

	/**
	 * 
	 * @param regDateStr
	 * @return
	 */
	private LocalDate toRegDate(String regDateStr) {
		Matcher matcher = StringLiterals.REG_DATE_PATTERN.matcher(regDateStr);

		if (matcher.find() == false) {
			throw new DateTimeException(regDateStr);
		}

		int year = Integer.valueOf(matcher.group(1));
		int month = Integer.valueOf(matcher.group(2));
		int day = Integer.valueOf(matcher.group(3));

		return LocalDate.of(year, month, day);

	}

	/**
	 * modify the Employer
	 * 
	 * @param scan scanner instance for user input
	 */
	public void modify(Scanner scan, boolean isDelete) {
		printAllEmployer();

		try {
			int selected = Integer.parseInt(getUserInput(scan, StringLiterals.MODIFY_EMPLOYER));
			Employer emp = dao.selectById(selected);

			if (isDelete) {
				remove(emp);
			} else {
				updateEmployer(scan, emp);
			}

		} catch (NumberFormatException e) {
			System.out.println(StringLiterals.NUMBER_FORMAT_EXCEPTION_MSG);
		} catch (EmployerIdNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (DateTimeException e) {
			System.out.println(StringLiterals.REG_DATE_INVALID);
		} catch (InvaildNameLengthException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * update the Employer
	 * 
	 * @param scan scanner instance for user input
	 * @param emp  update target Employer
	 * @throws EmployerIdNotFoundException if id not exists in list
	 * @throws InvaildNameLengthException
	 */
	private void updateEmployer(Scanner scan, Employer emp)
			throws EmployerIdNotFoundException, InvaildNameLengthException {
		String modifyName = getUserInput(scan, StringLiterals.MODIFY_NAME);
		String regDateStr = getUserInput(scan, StringLiterals.INPUT_REGDATE);
		LocalDate regDate = toRegDate(regDateStr);

		emp.setName(modifyName);
		emp.setRegDate(regDate);
		dao.update(emp);
	}

	/**
	 * remove the Employer
	 * 
	 * @param scan scanner instance for user input
	 * @param emp  remove target Employer
	 */
	public void remove(Employer emp) {
		dao.delete(emp);
		System.out.println(StringLiterals.DELETE_COMPLITE);
	}

	/**
	 * get user input using scanner
	 * 
	 * @param scan     scanner instance for user input
	 * @param printMsg user message for print
	 * @return user input
	 */
	private String getUserInput(Scanner scan, String printMsg) {
		System.out.print(printMsg);
		return scan.nextLine();
	}
}
