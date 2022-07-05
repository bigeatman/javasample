package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.model.MemberDao;
import spring.model.printer.MemberInfoPrinter;
import spring.model.printer.MemberListPrinter;
import spring.model.printer.MemberPrinter;
import spring.model.printer.MemberSummaryPrinter;
import spring.model.printer.VersionPrinter;
import spring.service.ChangePasswordService;
import spring.service.MemberRegisterService;

@Configuration
public class AppCtx {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	@Qualifier("printer")
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}

	@Bean
	@Qualifier("sumPrinter")
	public MemberSummaryPrinter memberPrinter2() {
		return new MemberSummaryPrinter();
	}

	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService();
	}

	@Bean
	public ChangePasswordService changePwdSvc() {
		return new ChangePasswordService();
	}

	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter();
	}

	@Bean
	public MemberInfoPrinter infoPrinter() {
		return new MemberInfoPrinter();
	}

	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter printer = new VersionPrinter();
		printer.setMajorVersion(5);
		printer.setMinorVersion(5);

		return printer;
	}
}
