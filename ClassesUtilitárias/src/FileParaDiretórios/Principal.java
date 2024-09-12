package FileParaDiretórios;

import java.io.File;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		File arquivoDiretorio = new File("criandoDiretorio");
		boolean isDiretorioCreated = arquivoDiretorio.mkdir();
		System.out.println("A pasta foi criada? " + isDiretorioCreated);
		
		File fileArquivoDiretorio = new File(arquivoDiretorio, "arquivo.txt");
		boolean isFileCreated = fileArquivoDiretorio.createNewFile();
		System.out.println("O arquivo txt foi criado? " + isFileCreated);
		
		File fileRenamed = new File(arquivoDiretorio, "arquivoRenomeado.txt");
		boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
		System.out.println("O arquivo txt foi renomeado?" + isRenamed);
		
		File diretorioRenamed = new File("diretorioRenomeado");
		boolean isDiretorioRenamed = arquivoDiretorio.renameTo(diretorioRenamed);
		System.out.println("O diretório foi renomeado? " + isDiretorioRenamed);
	}
}