package model;
import java.time.*;

public class Livro {
	private final String title;
	private	final int id;
	private final LocalDate release;

	public Livro(String t) {
		title = t;
		id = 1;
		// it must create a DB register
	}
	public Livro() {
        title = "Clean Code";
        release = LocalDate.of(2008, 8, 1);
		id = 1;
	}

	public void showInfo() {
		System.out.println("Book title: " + title);
		System.out.println("Book release: " + release);
	}
}

