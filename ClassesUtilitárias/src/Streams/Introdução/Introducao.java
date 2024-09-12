package Streams.Introdução;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Introducao {
	private static List<FilmeAventura> listaFilmes = new ArrayList<> (List.of(new FilmeAventura("T.B", 10.90), new FilmeAventura("P.B", 15.90), new FilmeAventura("M.R", 5.90)));
	
	public static void main(String[] args) {
		listaFilmes.sort(Comparator.comparing(FilmeAventura::getTitulo));
		List<String> titulos = new ArrayList<String>();
		for(FilmeAventura fa: listaFilmes) {
			if(fa.getPreco() <= 5) {
				titulos.add(fa.getTitulo());
			}
			if(titulos.size() >= 1) {
				break;
			}
		}
		
		System.out.println(listaFilmes);
	}
}