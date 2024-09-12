package Coleções.SortingLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<String> filmes = new ArrayList<>(3);
		filmes.add("Invasão Zumbi.");
		filmes.add("60 segundos.");
		filmes.add("Lobo de Wall Street.");
		Collections.sort(filmes);
		
		for(String filme: filmes) {
			System.out.println(filme);
		}
		
		List<Double> numeros = new ArrayList<>();
		numeros.add(100.21);
		numeros.add(23.20);
		numeros.add(45.13);
		Collections.sort(numeros);
		
		for(double numero: numeros){
			System.out.println(numero);
		}
	}
}