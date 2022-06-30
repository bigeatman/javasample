package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		ctx.getBean("client2", Client2.class);
		ctx.getBean("client", Client.class).send();
		ctx.close();
	}
}
