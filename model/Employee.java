package model;

public class Employee extends User {
	public Employee() {
		super("Dad", 2, Level.EMPLOYEE);
	};

	public Employee(String name) {
		super(name, 2, Level.EMPLOYEE);
	};

}
