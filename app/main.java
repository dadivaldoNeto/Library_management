import java.sql.DriverManager;
import java.sql.SQLException;

import model.*;

public class main {
	public static void main(String[] args) {
		Livro myLivro = new Livro();
		myLivro.showInfo();
		Client hi = new Client();
		hi.showInfo();

		connect();
	}

    public static void connect() {
        // connection string
        var url = "jdbc:sqlite:lib.db";
        var sql = "SELECT * FROM User";

        try (var conn = DriverManager.getConnection(url);
             var stmt = conn.createStatement();
             var rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.printf("%-5s%-25s%n",
                        rs.getInt("id"),
                        rs.getString("name")
                );
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
