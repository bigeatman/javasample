package service;

public class RegisterRequest {

	private String email;
	private String password;
	private String confirmPassword;
	private String name;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isPasswordEqualToConfirmPassword() {
		return !isPasswordNull() && !isConfirmPasswordNull() && password.equals(confirmPassword);
	}

	public boolean isEmailNull() {
		return isNull(this.email);
	}

	public boolean isPasswordNull() {
		return isNull(this.password);
	}

	public boolean isConfirmPasswordNull() {
		return isNull(this.confirmPassword);
	}

	private boolean isNull(String target) {
		return (target == null) || (target.trim().length() == 0);
	}

	@Override
	public String toString() {
		return "RegisterRequest [email=" + email + ", password=" + password + ", confirmPassword=" + confirmPassword + ", name=" + name + "]";
	}

}
