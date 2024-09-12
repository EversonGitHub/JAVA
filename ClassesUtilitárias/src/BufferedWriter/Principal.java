package BufferedWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		File arquivo = new File("FileWriter.txt");
		try(FileWriter fw = new FileWriter(arquivo); 
			BufferedWriter br = new BufferedWriter(fw)) {
			br.write("Conteúdo...");
			br.newLine();
			br.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}