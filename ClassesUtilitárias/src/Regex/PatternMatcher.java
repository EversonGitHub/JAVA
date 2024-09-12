package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		// \d = Todos os dígitos.
		// \D = Tudo o que não for digito.
		// \s = Posição no espaço em branco.
		// \S = Trás todos os caracteres excluindo os espaços em branco.
		// [] = Personaliza uma busca específica. Ex: [abc].
		// ? = Zero ou uma ocorrência.
		// * = Zero ou mais ocorrências.
		// + = Uma ou mais occorrências.
		// {} = Valores específicos. Ex: {1,3}
		
		String d = "\\d";
		String s = "\\s";
		String regex = "aba";
		String regex2 = "ababb baaabba";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(regex2);
		
		System.out.println("Texto: " + regex2);
		System.out.println("Índice: 0123456789");
		System.out.println("Regex: " + regex);
		System.out.println("Posições encontradas.");
		while(m.find()){
			System.out.print(m.start() + " " + m.group() + "\n");
		}
		
		int numeroHex = 0x59F86A;
		System.out.println(numeroHex);
	}
}