package spring.model.printer;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.model.Member;
import spring.model.MemberDao;

public class MemberListPrinter {

	@Autowired
	private MemberDao memberDao;

	@Autowired
	@Qualifier("sumPrinter")
	private MemberPrinter printer;

	public MemberListPrinter() {
		super();
	}

	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m -> printer.print(m));
	}
}
