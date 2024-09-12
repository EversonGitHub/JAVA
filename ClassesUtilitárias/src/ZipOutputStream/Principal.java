package ZipOutputStream;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Principal {

	public static void main(String[] args) {
		Path arquivoZip = Paths.get("Pasta/arquivo.zip");
		Path arquivoParaZipar = Paths.get("Pasta/Subpasta/SubSubPasta");
		zip(arquivoZip, arquivoParaZipar);	
	}
	
	private static void zip(Path arquivoZip, Path arquivoParaZipar) {
		try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
			DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivoParaZipar)){
			for(Path file: directoryStream) {
				ZipEntry ze = new ZipEntry(file.getFileName().toString());
				zipStream.putNextEntry(ze);
				Files.copy(file, zipStream);
				zipStream.closeEntry();
			}
			System.out.println("Arquivo criado com sucesso.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}