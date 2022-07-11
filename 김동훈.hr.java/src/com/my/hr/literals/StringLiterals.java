package com.my.hr.literals;

import java.util.regex.Pattern;

public class StringLiterals {

	/** main menu string */
	public static final String MAIN_MENU = "1. 목록, 2. 추가, 3. 수정, 4. 삭제, 5. 종료";

	/** user input character */
	public static final String CHAR_USER_INPUT = "입력: >";

	/** error message : NumberFormatException */
	public static final String NUMBER_FORMAT_EXCEPTION_MSG = "숫자를 입력하세요.\n";

	/** error message : invalid selected menu */
	public static final String INVALID_SELECTED_MENU_MSG = "1 ~ 5 사이의 메뉴를 선택하세요.";

	/** input name message */
	public static final String INPUT_NAME = "이름 : ";

	/** input reg date message */
	public static final String INPUT_REGDATE = "입사일 : ";

	/** msg for select modifying target */
	public static final String MODIFY_EMPLOYER = "대상 ID : ";

	/** format for print employer */
	public static final String EMPLOYER_TOSTR_FORMAT = "%d\t\t%s\t\t%s";

	/** header for print all employer */
	public static final String EMPLOYER_PRINTALL_HEADER = "ID\t\tNAME\t\tRegistered Date";

	/** separator */
	public static final String SEPARATOR = "===============================================";

	/** msg for print all employer count */
	public static final String EMPLOYER_TOTAL_COUNT = "전체 목록 수 : ";

	/** msg for input name to change */
	public static final String MODIFY_NAME = "수정할 이름 : ";

	/** msg for delete Employer */
	public static final String DELETE_COMPLITE = "삭제 완료";

	/** regex format for input reg date */
	public static final Pattern REG_DATE_PATTERN = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)");

	/** msg for input date is invalid */
	public static final String REG_DATE_INVALID = "날짜가 올바르지 않습니다.";
}
