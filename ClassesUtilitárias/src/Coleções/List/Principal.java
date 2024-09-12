package Coleções.List;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Lionel Messi.");
		nomes.add("Ronaldinho Gaúcho.");
		
		for(String nome: nomes) {
			System.out.println(nome);
		}
		
		nomes.add("Zidane.");
		System.out.println("====================");
		
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
	}
}