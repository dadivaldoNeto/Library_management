package model;
import java.time.*;


public class Livro {
	private final String title;
	private final int pages;
	private final LocalDate release;
	private final String idiom;
	private final String author;

	public Livro(String t, int p, LocalDate r, String id, String aut) {
		title = t;
		pages = p;
		release = r;
		idiom = id;
		author = aut;
		// it must create a DB register
	}
	public Livro() {
        title = "Clean Code";
        pages = 464;
        release = LocalDate.of(2008, 8, 1);
        idiom = "English";
        author = "Robert C. Martin";
	}

	public void showInfo() {
		System.out.println("Book title: " + title);
		System.out.println("Book pages: " + pages);
		System.out.println("Book idiom: " + idiom);
		System.out.println("Book release: " + release);
		System.out.println("Book author: " + author);
	}
}

