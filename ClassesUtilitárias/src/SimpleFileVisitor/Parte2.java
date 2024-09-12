package SimpleFileVisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Parte2 {
	public static void main(String[] args) throws IOException{
		Path root = Paths.get(".");
		Files.walkFileTree(root, new ListAllFiles());
	}
}

class ListJavaFiles extends SimpleFileVisitor<Path>{
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes at) {
		System.out.println(file.getFileName());
		return FileVisitResult.CONTINUE;
	}
}