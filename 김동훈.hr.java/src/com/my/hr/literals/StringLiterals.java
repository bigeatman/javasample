package com.my.hr.literals;

import java.util.regex.Pattern;

public class StringLiterals {

	/** main menu string */
	public static final String MAIN_MENU = "1. ���, 2. �߰�, 3. ����, 4. ����, 5. ����";

	/** user input character */
	public static final String CHAR_USER_INPUT = "�Է�: >";

	/** error message : NumberFormatException */
	public static final String NUMBER_FORMAT_EXCEPTION_MSG = "���ڸ� �Է��ϼ���.\n";

	/** error message : invalid selected menu */
	public static final String INVALID_SELECTED_MENU_MSG = "1 ~ 5 ������ �޴��� �����ϼ���.";

	/** input name message */
	public static final String INPUT_NAME = "�̸� : ";

	/** input reg date message */
	public static final String INPUT_REGDATE = "�Ի��� : ";

	/** msg for select modifying target */
	public static final String MODIFY_EMPLOYER = "��� ID : ";

	/** format for print employer */
	public static final String EMPLOYER_TOSTR_FORMAT = "%d\t\t%s\t\t%s";

	/** header for print all employer */
	public static final String EMPLOYER_PRINTALL_HEADER = "ID\t\tNAME\t\tRegistered Date";

	/** separator */
	public static final String SEPARATOR = "===============================================";

	/** msg for print all employer count */
	public static final String EMPLOYER_TOTAL_COUNT = "��ü ��� �� : ";

	/** msg for input name to change */
	public static final String MODIFY_NAME = "������ �̸� : ";

	/** msg for delete Employer */
	public static final String DELETE_COMPLITE = "���� �Ϸ�";

	/** regex format for input reg date */
	public static final Pattern REG_DATE_PATTERN = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)");

	/** msg for input date is invalid */
	public static final String REG_DATE_INVALID = "��¥�� �ùٸ��� �ʽ��ϴ�.";
}
