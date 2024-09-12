package BasicFileAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class Parte2 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("PastaNIO/novoPath.txt");
		BasicFileAttributes bfa = Files.readAttributes(path, BasicFileAttributes.class);
		FileTime creationTime = bfa.creationTime();
		FileTime lastModifiedTime = bfa.lastModifiedTime();
		FileTime lastAcessTime = bfa.lastAccessTime();

		System.out.println("Criação: " + creationTime);
		System.out.println("Última modificação: " + lastModifiedTime);
		System.out.println("Último acesso: " + lastAcessTime);
		
		BasicFileAttributeView fav = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
		fav.setTimes(lastModifiedTime, newCreationTime, newCreationTime);
		
		creationTime = fav.readAttributes().creationTime();
		lastModifiedTime = fav.readAttributes().lastModifiedTime();
		lastAcessTime = fav.readAttributes().lastAccessTime();
		
		System.out.println("Criação: " + creationTime);
		System.out.println("Última modificação: " + lastModifiedTime);
		System.out.println("Último acesso: " + lastAcessTime);
	}
}