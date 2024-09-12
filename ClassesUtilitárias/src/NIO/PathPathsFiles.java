package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathPathsFiles {

	public static void main(String[] args) throws IOException {
		Path pastaPath = Paths.get("PastaNIO");
		if(Files.notExists(pastaPath)) {	
			Path diretorio = Files.createDirectory(pastaPath);
		}
		
		Path subPastaPath = Paths.get("Pasta/Subpasta/SubSubPasta");
		Path subPastaDiretorio = Files.createDirectories(subPastaPath);
		Path arquivoPath = Paths.get(subPastaPath.toString(), "arquivo.txt");
		
		if(Files.notExists(arquivoPath)) {
			Path arquivoPathCriado = Files.createFile(arquivoPath);
		}
		
		Path source = arquivoPath;
		Path target = Paths.get(arquivoPath.getParent().toString(), "arquivoRenomeado.txt");
		Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
		
	}
}