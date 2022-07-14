package main;

import java.util.Collection;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppCtx;
import exception.DuplicateMemberException;
import model.Member;
import model.MemberDao;
import service.MemberRegisterService;
import service.RegisterRequest;

public class Main {

	private static AnnotationConfigApplicationContext ctx;

	public static void main(String[] args) {

		ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Input >> ");
			String msg = scan.nextLine();

			if (msg.equals("exit")) {
				break;
			} else if (msg.startsWith("new")) {
				processNewCommand(msg.split(" "));
			} else if (msg.equals("change")) {
				processChangeCommand();
			} else if (msg.equals("list")) {
				processListCommand();
			} else if (msg.equals("info")) {
				processInfoCommand();
			}
		}

		scan.close();
		ctx.close();
	}

	private static void processInfoCommand() {
		// TODO Auto-generated method stub

	}

	private static void processListCommand() {
		Collection<Member> dao = ctx.getBean(MemberDao.class).selectAll();

		for (Member mem : dao) {
			System.out.println(mem);
		}
	}

	private static void processChangeCommand() {
		// TODO Auto-generated method stub
	}

	private static void processNewCommand(String[] args) {
		if (args.length != 5) {
			return;
		}

		RegisterRequest rq = new RegisterRequest();
		rq.setEmail(args[1]);
		rq.setName(args[2]);
		rq.setPassword(args[3]);
		rq.setConfirmPassword(args[4]);

		if (rq.isPasswordEqualToConfirmPassword() == false) {
			System.out.println("비밀번호 불일치");
			return;
		}

		try {
			ctx.getBean(MemberRegisterService.class).regist(rq);
		} catch (DuplicateMemberException e) {
			System.out.println("이미 존재하는 이메일입니다.");
		}
	}
}
