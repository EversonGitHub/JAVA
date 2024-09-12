package Exception;

import java.io.File;
import java.io.IOException;

public class TesteException {
	public static void main(String[] args) throws IOException {
		criarNovoArquivo();
	}
	
	private static void criarNovoArquivo() throws IOException{
		File arquivo = new File("C:\\Users\\01110010101\\Desktop\\eclipse-workspace\\Exception\\Arquivo\\teste.txt");
		try {
			boolean isCriado = arquivo.createNewFile();
			System.out.println("Arquivo criado com sucesso." + isCriado);
		}catch(IOException e){
			e.printStackTrace();
			throw new RuntimeException("Erro ao tentar criar arquivo.");
		}
	}
}
