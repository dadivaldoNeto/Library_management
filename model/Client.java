package model;

public class Client extends User{
	
	public Client() {
		super("Dad", 1, Level.CLIENT);
	};

	public Client(String name) {
		super(name, 1, Level.CLIENT);
	};

}
