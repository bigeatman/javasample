package example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("applicationContext.xml");
		System.out.println(ctx.getBean(SSTv.class));
		System.out.println(ctx.getBean(LgTv.class));
		ctx.close();
	}
}
