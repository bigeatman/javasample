package spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import spring.exception.MemberNotFoundException;
import spring.model.Member;
import spring.model.MemberDao;

public class ChangePasswordService {

	@Autowired
	private MemberDao memberDao;

	public void changePassword(String email, String oldPwd, String newPwd) {
		Member member = memberDao.selectByEmail(email);

		if (member == null) {
			throw new MemberNotFoundException();
		}

		member.changePassword(oldPwd, newPwd);
		memberDao.update(member);
	}

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public MemberDao getMemberDao() {
		return memberDao;
	}

}
