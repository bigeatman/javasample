package main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppCtx;
import spring.RegisterRequest;
import spring.exception.DuplicateMemberException;
import spring.exception.MemberNotFoundException;
import spring.exception.WrongIdPasswordException;
import spring.model.printer.MemberInfoPrinter;
import spring.model.printer.MemberListPrinter;
import spring.model.printer.VersionPrinter;
import spring.service.ChangePasswordService;
import spring.service.MemberRegisterService;

public class MainForSpring {

	private static ApplicationContext ctx = null;

	public static void main(String[] args) {
		ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		System.out.println(ctx.getBean("infoPrinter", MemberInfoPrinter.class).getPrinter().getFormatter());

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
			} else if (input.startsWith("list")) {
				processListCommand();
			} else if (input.startsWith("info")) {
				processInfoCommand(input.split(" "));
			} else if (input.startsWith("version")) {
				processVersionCommand();
			} else {
				printHelp();
			}
		}

		scan.close();
	}

	private static void processVersionCommand() {
		ctx.getBean("versionPrinter", VersionPrinter.class).print();
	}

	private static void processInfoCommand(String[] split) {
		if (split.length != 2) {
			printHelp();
		} else {
			ctx.getBean("infoPrinter", MemberInfoPrinter.class).printMemberInfo(split[1]);
		}
	}

	private static void processListCommand() {
		ctx.getBean("listPrinter", MemberListPrinter.class).printAll();
	}

	private static void printHelp() {
		// TODO Auto-generated method stub

	}

	private static void processChangeCommand(String[] arg) {
		if (arg.length != 4) {
			printHelp();
			return;
		}

		ChangePasswordService svc = ctx.getBean("changePasswordService", ChangePasswordService.class);

		try {
			svc.changePassword(arg[1], arg[2], arg[3]);
			System.out.println("암호를 변경했습니다.");
		} catch (MemberNotFoundException e) {
			System.out.println("존재하지 않는 이메일입니다.");
		} catch (WrongIdPasswordException e) {
			System.out.println("이메일과 암호가 일치하지 않습니다.");
		}
	}

	private static void processNewCommand(String[] arg) {
		if (arg.length != 5) {
			printHelp();
			return;
		}

		MemberRegisterService regSvc = ctx.getBean("memberRegisterService", MemberRegisterService.class);
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
