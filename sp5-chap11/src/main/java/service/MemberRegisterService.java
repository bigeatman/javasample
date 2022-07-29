package service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

import exception.DuplicateMemberException;
import model.Member;
import model.MemberDao;

public class MemberRegisterService {

	@Autowired
	private MemberDao memberDao;

	public Long regist(RegisterRequest req) throws DuplicateMemberException {
		Member member = memberDao.selectByEmail(req.getEmail());

		if (member != null) {
			throw new DuplicateMemberException("dup email " + req.getEmail());
		}

		Member newMember = new Member(req.getEmail(), req.getPassword(), req.getName(), LocalDateTime.now());
		memberDao.insert(newMember);

		return newMember.getId();
	}
}
