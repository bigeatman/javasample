package service;

import java.time.LocalDateTime;

import exception.DuplicateMemberException;
import model.Member;
import model.MemberDao;

public class MemberRegisterService {
	private MemberDao memberDao;

	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public Long regist(RegisterRequest req) throws DuplicateMemberException {
		Member member = memberDao.selectByEmail(req.getEmail());

		if (member != null) {
			throw new DuplicateMemberException("dup email " + req.getEmail());
		}

		Member newMember = new Member(req.getEmail(), req.getPassword(), req.getName(), LocalDateTime.now());
		memberDao.insert(newMember);

		return newMember.getId();
	}

	public MemberDao getMemberDao() {
		return memberDao;
	}
}
