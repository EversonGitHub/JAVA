package Streams.Introdução;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Introducao2 {
	private static List<FilmeAventura> listaFilmes = new ArrayList<> (List.of(new FilmeAventura("T.B", 10.90), new FilmeAventura("P.B", 15.90), new FilmeAventura("M.R", 5.90)));
	
	public static void main(String[] args) {
		
		List<String> titulos = listaFilmes.stream().sorted(Comparator.comparing(FilmeAventura::getTitulo)).filter(ln -> ln.getPreco() <= 5).limit(1).map(FilmeAventura::getTitulo).collect(Collectors.toList());
		
		System.out.println(listaFilmes);
	}
}