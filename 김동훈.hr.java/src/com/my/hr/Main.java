package com.my.hr;

import com.my.hr.presentation.ProgramHandler;

public class Main {
	public static void main(String[] args) {
		ProgramHandler handler = ProgramHandler.getInstance();

		while (true) {
			int selected = handler.selectMenu();

			switch (selected) {
			case 1:
				handler.printAllEmployer();
				break;
			case 2:
				handler.addEmployer();
				break;
			case 3:
				handler.modifyEmployer();
				break;
			case 4:
				handler.removeEmployer();
				break;
			case 5:
				return;
			}
		}
	}
}
