package BufferedReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		File arquivo = new File("C:\\Users\\01110010101\\Desktop\\eclipse-workspace\\ClassesUtilitárias\\src\\IO_File\\arquivoIO.txt");
		try(FileReader fr = new FileReader(arquivo); 
			BufferedReader br = new BufferedReader(fr)){;
			String linha;
			while((linha = br.readLine()) != null){
				System.out.println(linha);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}