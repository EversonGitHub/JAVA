package MultiplasExceções;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasExcecoes {

	public static void main(String[] args) {
		try{
			throw new RuntimeException();
		}catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
			System.out.println("Tratando exceção.");
		}catch (RuntimeException e) {
			System.out.println("Tratando exceção.");
		}

		try{
			possivelExcecao();
		}catch (IOException | SQLException e) {
			e.printStackTrace();
		}
	}

	private static void possivelExcecao() throws SQLException, FileNotFoundException, IOException {

	}
}