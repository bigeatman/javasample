package service;

import org.springframework.transaction.annotation.Transactional;

import exception.MemberNotFoundException;
import model.Member;
import model.MemberDao;

public class ChangePasswordService {
	private MemberDao memberDao;

	public ChangePasswordService() {
		super();
	}

	public ChangePasswordService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	@Transactional
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
