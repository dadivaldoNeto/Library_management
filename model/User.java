package model;

public class User {
	
	private final String name;
	private final int id;
	private final int age;
	private static int total_users = 0; 

	public User() {
		name = "ABC";
		id = ++total_users;
		age = 13;
	}

	public User(String n, int a) {
		name = n;
		id = ++total_users;
		age = a;
	}
}
