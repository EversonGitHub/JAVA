package Streams.FlatMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Parte1 {

	public static void main(String[] args) {
		List<List<String>> instituicao = new ArrayList<>();
		List<String> designerGrafico = List.of("Vanderlei", "Cleber", "Ana");
		List<String> devs = List.of("Alisson", "Marcelo", "Everson");
		List<String> estudantes = List.of("Pedro", "Monica", "Ramon");
		
		instituicao.add(designerGrafico);
		instituicao.add(devs);
		instituicao.add(estudantes);
		
		instituicao.stream().flatMap(Collection::stream).forEach(System.out::println);
	}
}