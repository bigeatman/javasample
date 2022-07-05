package ch08.ex01;

@Universal
@Type(name = "class", value = 1)
public class MyClass {

	@Field(value = 1)
	private String name;

	@Constructor
	public MyClass() {
		super();
	}

	@Method
	public void play(@Parameter String name) {
		@Local
		int temp = 0;
	}
}
