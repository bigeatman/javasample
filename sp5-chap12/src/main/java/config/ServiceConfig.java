package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import service.ChangePasswordService;
import service.MemberRegisterService;

@Configuration
public class ServiceConfig {

	@Bean
	public ChangePasswordService changePasswordService() {
		return new ChangePasswordService();
	}

	@Bean
	public MemberRegisterService memberRegisterService() {
		return new MemberRegisterService();
	}
}
