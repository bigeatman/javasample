package model;

public class AuthInfo {

	private Long id;

	private String email;

	private String name;

	public AuthInfo(Long id, String email, String name) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
	}

	public final Long getId() {
		return id;
	}

	public final String getEmail() {
		return email;
	}

	public final String getName() {
		return name;
	}

}
