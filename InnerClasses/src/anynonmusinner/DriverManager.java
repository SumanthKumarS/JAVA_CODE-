package anynonmusinner;

public class DriverManager {
	static Connection getConnection() {
		Connection con  = new Connection() {

			@Override
			public void createStatement() {
				System.out.println("Anaymous Inner class");
			}
			
		};
		return con;
	}
}
