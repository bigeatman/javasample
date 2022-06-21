package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.ChangePasswordService;
import spring.MemberRegisterService;
import spring.model.MemberDao;

@Configuration
public class AppCtx {

	@Bean
	public MemberDao memberDao() {
		System.out.println("TEST");
		return new MemberDao();
	}

	@Bean
	public MemberRegisterService memberRegSvc() {
		System.out.println("ttt");
		return new MemberRegisterService(memberDao(), memberDao());
	}

	@Bean
	public ChangePasswordService changePwdSvc() {
		System.out.println("ttt22");
		return new ChangePasswordService(memberDao());
	}
}
