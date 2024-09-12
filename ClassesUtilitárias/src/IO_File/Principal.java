package IO_File;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class Principal {

	public static void main(String[] args) {
		File arquivo = new File("C:\\Users\\01110010101\\Desktop\\eclipse-workspace\\ClassesUtilitárias\\src\\IO_File\\arquivoIO.txt");
		try {
			boolean isCreated = arquivo.createNewFile();
			System.out.println("Arquivo criado: " + isCreated);
			System.out.println("Path: " + arquivo.getPath());
			System.out.println("Path absolute: " + arquivo.getAbsolutePath());
			System.out.println("Diretório: " + arquivo.isDirectory());
			System.out.println("File: " + arquivo.isFile());
			System.out.println("Hidden: " + arquivo.isHidden());
			System.out.println("Última modificação: " + Instant.ofEpochMilli(arquivo.lastModified()).atZone(ZoneId.systemDefault()));
			boolean exists = arquivo.exists();
			if(exists){
				//System.out.println("Deletando arquivo..." + arquivo.delete());
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}