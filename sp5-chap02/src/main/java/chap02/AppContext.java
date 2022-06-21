package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

	@Bean
	public Greeter greeter() {
		Greeter g = new Greeter();
		g.setFormat("%s. 안녕하세요!");
		System.out.println("greeter() called : " + g);
		return g;
	}

	@Bean
	public String test() {
		String test = new String("This is test string.");
		return test;
	}
}
