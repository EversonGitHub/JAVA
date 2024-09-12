package Streams.FindingMatching;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Streams.Introdução.FilmeAventura;

public class Principal {

private static List<FilmeAventura> listaFilmes = new ArrayList<> (List.of(new FilmeAventura("T.B", 10.90), new FilmeAventura("P.B", 15.90), new FilmeAventura("M.R", 5.90), new FilmeAventura("HIMYM", 250)));
	
	public static void main(String[] args) {
		System.out.println(listaFilmes.stream().anyMatch(ln -> ln.getPreco() > 9));
		System.out.println(listaFilmes.stream().allMatch(ln -> ln.getPreco() > 0));
		System.out.println(listaFilmes.stream().noneMatch(ln -> ln.getPreco() < 0));
		
		listaFilmes.stream().filter(ln -> ln.getPreco() > 3).findAny().ifPresent(System.out::println);
		listaFilmes.stream().filter(ln -> ln.getPreco() > 3).sorted(Comparator.comparing(FilmeAventura::getPreco)).findFirst().ifPresent(System.out::println);
		
	}
}