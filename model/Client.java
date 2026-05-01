package model;

public class Client extends User{
	
	public Client() {

	};
	public boolean reservarLivro(int bookId) {
		return (true);
	}

	public boolean AvaliarLivro(int id) {
		return true;
	}

	public boolean devolverLivro(int bookId) {
		return true;
	}
}
