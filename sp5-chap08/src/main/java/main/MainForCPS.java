package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppCtx;
import exception.MemberNotFoundException;
import exception.WrongIdPasswordException;
import service.ChangePasswordService;

public class MainForCPS {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		ChangePasswordService cps = ctx.getBean(ChangePasswordService.class);

		try {
			cps.changePassword("abcd@abcd", "1111", "2323");
		} catch (MemberNotFoundException e) {
			e.printStackTrace();
		} catch (WrongIdPasswordException e) {
			e.printStackTrace();
		}

		ctx.close();
	}
}
