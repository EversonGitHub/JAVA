package Coleções.Set_HashSet;

import java.util.HashSet;
import java.util.Set;

import Coleções.SortingLists.Filme;

public class Principal {

	public static void main(String[] args) {
		Set<Filme> filmes = new HashSet<>();
		filmes.add(new Filme(5L, "O senhor dos anéis.", 19.5));
		filmes.add(new Filme(4L, "Matrix.", 19.5));
		filmes.add(new Filme(1L, "John Wick.", 19.5));
		filmes.add(new Filme(6L, "Cidade de DEUS.", 19.5));
		
		for(Filme filme: filmes) {
			System.out.println(filme);
		}
	}
}