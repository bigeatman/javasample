package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chap07.calculator.Calculator;
import config.AppCtx;

public class MainAspect {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

		Calculator cal = ctx.getBean("calculator", Calculator.class);
		long fiveFact = cal.factorial(5);

		System.out.println(fiveFact);
		System.out.println(cal.getClass().getName());
		ctx.close();
	}
}
