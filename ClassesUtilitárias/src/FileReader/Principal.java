package FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		File arquivo = new File("C:\\Users\\01110010101\\Desktop\\eclipse-workspace\\ClassesUtilitárias\\src\\IO_File\\arquivoIO.txt");
		try(FileReader fr = new FileReader(arquivo)) {
			char[] in = new char[1];
			fr.read(in);
			for(char c: in) {
				System.out.println(c);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}