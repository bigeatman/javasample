package spring.model.printer;

import spring.model.Member;
import spring.model.MemberDao;

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

	public void setMemDao(MemberDao memDao) {
		this.memDao = memDao;
	}

	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}

}