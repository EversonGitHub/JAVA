package FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		File arquivo = new File("FileWriter.txt");
		try(FileWriter fw = new FileWriter(arquivo)) {
			fw.write("Conteúdo...");
			fw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}