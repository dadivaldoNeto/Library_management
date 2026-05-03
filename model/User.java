package model;

public abstract class User {

	private final String name;
	protected final int id;
	private final int age;
	protected String level;
	private static int total_users = 0; 

	public void showInfo() {
		System.out.println("User: " + name);
		System.out.println("Id: " + id);
		System.out.println("How old: " + age);
	}

	private User() {
		name = "ABC";
		id = ++total_users;
		age = 13;
	}

	public User(String n, int a) {
		name = n;
		id = ++total_users;
		age = a;
	}

	String getUserName() {
		return (this.name);
	}

	int getId() {
		return (this.id);
	}

	int getAge() {
		return (this.age);
	}
	
	String getLevel() {
		return (this.level);
	}

	void setLevel(String level) {
		if (level.isEmpty()) {
			System.out.println("Can't update level");
			return ;
		}
		this.level = level;
	}

}
