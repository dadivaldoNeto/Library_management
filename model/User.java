package model;

public abstract class User {

	protected final Level level;
	protected final String name;
	protected final int id;

	protected User() {
		this.level(1);
		this.name = "Dad";
		this.id = 1;
	}

	protected User(String name, int id, Level level) {
		this.level = level;
		this.name = name;
		this.id = id;
	}

	public void showInfo() {
		System.out.println("User: " + name);
		System.out.println("Id: " + id);
	}
}
