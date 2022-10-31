package controller;

public class ChangePwdCommand {

	private String currentPasssword;

	private String newPassword;

	public String getCurrentPasssword() {
		return currentPasssword;
	}

	public void setCurrentPasssword(String currentPasssword) {
		this.currentPasssword = currentPasssword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}
