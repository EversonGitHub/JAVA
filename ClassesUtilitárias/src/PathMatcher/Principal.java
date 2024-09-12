package PathMatcher;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class Principal {

	public static void main(String[] args) {
		Path path = Paths.get("Pasta/SubPasta/arquivo.bkp");
		Path path2 = Paths.get("Pasta/SubPasta/arquivo.txt");
		Path path3 = Paths.get("Pasta/SubPasta/arquivo.java");
		
		matches(path, "glob:*.bkp");
		matches(path, "glob:**/*.bkp");
		matches(path, "glob:**/*.{bkp,txt,java}");
		matches(path2, "glob:**/*.{bkp,txt,java}");
		matches(path3, "glob:**/*.{bkp,txt,java}");
		matches(path, "glob:**/*.???");
		matches(path2, "glob:**/*.???");
		matches(path3, "glob:**/*.???");
		matches(path3, "glob:**/file.???");
	}
	
	private static void matches(Path path, String glob) {
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
		System.out.println(glob + ": " + matcher.matches(path));
	}
}