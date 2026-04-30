package model;

public class User {
	
	private final String name;
	private final int id;
	private final int age;
	protected String level;
	private static int total_users = 0; 

	protected User() {
		name = "ABC";
		id = ++total_users;
		age = 13;
	}

	protected User(String n, int a) {
		name = n;
		id = ++total_users;
		age = a;
	}
}
