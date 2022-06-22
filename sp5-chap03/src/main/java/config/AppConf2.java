package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.ChangePasswordService;
import spring.MemberRegisterService;
import spring.model.MemberDao;
import spring.model.printer.MemberInfoPrinter;
import spring.model.printer.MemberListPrinter;
import spring.model.printer.MemberPrinter;
import spring.model.printer.VersionPrinter;

@Configuration
public class AppConf2 {

	@Autowired
	private MemberDao memberDao;

	@Autowired
	private MemberPrinter memberPrinter;

	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao);
	}

	@Bean
	public ChangePasswordService changePwdSvc() {
		return new ChangePasswordService(memberDao);
	}

	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter(memberDao, memberPrinter);
	}

	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter printer = new MemberInfoPrinter();
		printer.setMemDao(memberDao);
		printer.setPrinter(memberPrinter);

		return printer;
	}

	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter printer = new VersionPrinter();
		printer.setMajorVersion(5);
		printer.setMinorVersion(0);

		return printer;
	}
}
