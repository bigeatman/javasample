package spring;

import spring.exception.MemberNotFoundException;
import spring.model.Member;
import spring.model.MemberDao;

public class ChangePasswordService {
	private MemberDao memberDao;

	public ChangePasswordService() {
		super();
	}

	public ChangePasswordService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

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
