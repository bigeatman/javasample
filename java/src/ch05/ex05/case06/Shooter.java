package ch05.ex05.case06;

public class Shooter {
	private Gun gun;

	public void fire() {
		gun.fire();
	}

	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}

}
