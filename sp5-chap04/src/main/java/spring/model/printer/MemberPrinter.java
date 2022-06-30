package spring.model.printer;

import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

import spring.model.Member;

public class MemberPrinter {

	private DateTimeFormatter formatter;

	public MemberPrinter() {
		super();
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
	}

	public void print(Member member) {
		if (formatter == null) {
			System.out.printf("회원정보: 아이디(%d), 이메일(%s), 이름(%s), 등록일(%s)\n", member.getId(), member.getEmail(),
					member.getName(), member.getRegisterDateTime());
		} else {
			System.out.printf("회원정보: 아이디(%d), 이메일(%s), 이름(%s), 등록일(%s)\n", member.getId(), member.getEmail(),
					member.getName(), formatter.format(member.getRegisterDateTime()));
		}
	}

	@Autowired
	public void setFormatter(@Nullable DateTimeFormatter formatter) {
		System.out.println("setter");
		this.formatter = formatter;
	}

	public DateTimeFormatter getFormatter() {
		return formatter;
	}

}
