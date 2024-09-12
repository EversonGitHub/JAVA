package ResolvendoPaths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal {

	public static void main(String[] args) {
		Path diretorio = Paths.get("Home/TesteSubPasta");
		Path arquivo = Paths.get("Teste/arquivo.txt");
		Path resolve = diretorio.resolve(arquivo);
		System.out.println(resolve);
		
		Path absoluto = Paths.get("Home/TesteSubPasta");
		Path relativo = Paths.get("Teste");
		Path file = Paths.get("arquivo.txt");
		
		System.out.println("1-" + absoluto.resolve(relativo));
		System.out.println("2-" + absoluto.resolve(file));
		System.out.println("3-" + relativo.resolve(absoluto));
		System.out.println("4-" + relativo.resolve(file));
		System.out.println("5-" + file.resolve(absoluto));
		System.out.println("6-" + file.resolve(relativo));
	}
}