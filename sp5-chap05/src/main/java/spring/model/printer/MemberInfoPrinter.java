package spring.model.printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.model.Member;
import spring.model.MemberDao;

@Component("infoPrinter")
public class MemberInfoPrinter {

	private MemberDao memDao;
	private MemberPrinter printer;

	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);

		if (member == null) {
			System.out.println("데이터 없음");
		} else {
			printer.print(member);
		}
	}

	@Autowired
	public void setMemDao(MemberDao memDao) {
		this.memDao = memDao;
	}

	@Autowired
	@Qualifier("summaryPrinter")
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}

	public MemberDao getMemDao() {
		return memDao;
	}

	public MemberPrinter getPrinter() {
		return printer;
	}

}