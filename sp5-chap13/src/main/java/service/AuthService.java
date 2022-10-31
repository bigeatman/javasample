package service;

import org.springframework.beans.factory.annotation.Autowired;

import exception.WrongIdPasswordException;
import model.AuthInfo;
import model.Member;
import model.MemberDao;

public class AuthService {

	@Autowired
	private MemberDao memberDao;

	public AuthInfo authenicate(String email, String password) {
		Member member = memberDao.selectByEmail(email);

		if (member == null) {
			throw new WrongIdPasswordException();
		} else if (member.matchPassword(password) == false) {
			throw new WrongIdPasswordException();
		}

		return new AuthInfo(member.getId(), member.getEmail(), member.getName());
	}
}
