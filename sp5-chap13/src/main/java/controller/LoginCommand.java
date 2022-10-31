package controller;

public class LoginCommand {

	private String email;

	private String password;

	private boolean rmemberEmail;

	public final String getEmail() {
		return email;
	}

	public final void setEmail(String email) {
		this.email = email;
	}

	public final String getPassword() {
		return password;
	}

	public final void setPassword(String password) {
		this.password = password;
	}

	public final boolean isRmemberEmail() {
		return rmemberEmail;
	}

	public final void setRmemberEmail(boolean rmemberEmail) {
		this.rmemberEmail = rmemberEmail;
	}
}
