package spring.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.RegisterRequest;
import spring.exception.DuplicateMemberException;
import spring.model.Member;
import spring.model.MemberDao;

@Component
public class MemberRegisterService {

	@Autowired
	private MemberDao memberDao;

	public MemberRegisterService() {
		super();
	}

	public Long regist(RegisterRequest req) {
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
