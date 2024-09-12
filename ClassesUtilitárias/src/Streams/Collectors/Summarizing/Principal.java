package Streams.Collectors.Summarizing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import Streams.Introdução.FilmeAventura;

public class Principal {
	private static List<FilmeAventura> listaFilmes = new ArrayList<> (List.of(new FilmeAventura("T.B", 10.90), new FilmeAventura("P.B", 15.90), new FilmeAventura("M.R", 5.90)));
	
	public static void main(String[] args) {
		System.out.println(listaFilmes.stream().count());
		System.out.println(listaFilmes.stream().collect(Collectors.counting()));
		
		listaFilmes.stream().max(Comparator.comparing(FilmeAventura::getPreco)).ifPresent(System.out::println);
		listaFilmes.stream().collect(Collectors.maxBy(Comparator.comparing(FilmeAventura::getPreco))).ifPresent(System.out::println);
		
		System.out.println(listaFilmes.stream().mapToDouble(FilmeAventura::getPreco).sum());
		System.out.println(listaFilmes.stream().collect(Collectors.summingDouble(FilmeAventura::getPreco)));
		
		listaFilmes.stream().mapToDouble(FilmeAventura::getPreco).average().ifPresent(System.out::println);
		System.out.println(listaFilmes.stream().collect(Collectors.averagingDouble(FilmeAventura::getPreco)));
		
		DoubleSummaryStatistics collect = listaFilmes.stream().collect(Collectors.summarizingDouble(FilmeAventura::getPreco));
		System.out.println(collect);
	}
}