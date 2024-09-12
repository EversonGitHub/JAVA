package BasicFileAttributes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Parte1 {

	public static void main(String[] args) throws IOException {
		LocalDateTime data = LocalDateTime.now().minusDays(10);
		File arquivo = new File("PastaNIO/novoArquivo.txt");
		boolean isCreated = arquivo.createNewFile();
		boolean isModified = arquivo.setLastModified(data.toInstant(ZoneOffset.UTC).toEpochMilli());
		
		Path path = Paths.get("PastaNIO/novoPath.txt");
		Files.createFile(path);
		FileTime fileTime = FileTime.from(data.toInstant(ZoneOffset.UTC));
		Files.setLastModifiedTime(path, fileTime);
		System.out.println(Files.isWritable(path));
		System.out.println(Files.isReadable(path));
		System.out.println(Files.isExecutable(path));
	}
}