package spring;

import java.util.Scanner;

import spring.exception.DuplicateMemberException;
import spring.exception.MemberNotFoundException;
import spring.exception.WrongIdPasswordException;

public class Main {

	private static Assembler assm = new Assembler();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("Input :");
			String input = scan.nextLine();

			if (input.equals("exit")) {
				break;
			} else if (input.startsWith("new")) {
				processNewCommand(input.split(" "));
			} else if (input.startsWith("change")) {
				processChangeCommand(input.split(" "));
			} else {
				printHelp();
			}
		}

		scan.close();
	}

	private static void printHelp() {
		// TODO Auto-generated method stub

	}

	private static void processChangeCommand(String[] arg) {
		if (arg.length != 4) {
			printHelp();
			return;
		}

		ChangePasswordService svc = assm.getPwdSvc();

		try {
			svc.changePassword(arg[1], arg[2], arg[3]);
		} catch (MemberNotFoundException e) {
			System.out.println("존재하지 않는 이메일입니다.");
		} catch (WrongIdPasswordException e) {
			System.out.println("이메일과 암호가 일치하지 않습니다.");
		} 

		System.out.println("암호를 변경했습니다.");
	}

	private static void processNewCommand(String[] arg) {
		if (arg.length != 5) {
			printHelp();
			return;
		}

		MemberRegisterService regSvc = assm.getRegSvc();
		RegisterRequest req = new RegisterRequest();
		req.setEmail(arg[1]);
		req.setName(arg[2]);
		req.setPassword(arg[3]);
		req.setConfirmPassword(arg[4]);

		if (req.isPasswordEqualToConfirmPassword() == false) {
			System.out.println("암호와 확인이 일치하지 않습니다.\n");
		}

		try {
			regSvc.regist(req);
		} catch (DuplicateMemberException e) {
			System.out.println("이미 존재하는 이메일입니다.");
		}
	}
}
