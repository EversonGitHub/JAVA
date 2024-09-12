package Range;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {

	public static void main(String[] args) {
		
		//String regex = "[a-zA-C]";
		String regex2 = "12 0x 0X 0xFFABC";
		String regex = "0 [xX] [1-9a-fA-F]";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(regex2);
		
		System.out.println("Texto: " + regex2);
		System.out.println("Índice: 0123456789");
		System.out.println("Regex: " + regex);
		System.out.println("Posições encontradas.");
		while(m.find()){
			System.out.print(m.start() + " " + m.group() + "\n");
		}
		
		int numeroHex = 0xDFA;
		System.out.println(numeroHex);
	}
}