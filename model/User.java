package model;

public abstract class User {

	protected final Level level;
	protected final String name;
	protected final int id;

	protected User(String name, int id, Level level) {
		this.level = level;
		this.name = name;
		this.id = id;
	}

	public void showInfo() {
		System.out.println("User NAME: " + name);
		System.out.println("User ID: " + id);
		System.out.println("User LEVEL: " + level);
	}
}
