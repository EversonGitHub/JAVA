package Streams.Collectors.GroupingBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Streams.Introdução.FilmeAventura;

public class Principal {
	private static List<FilmeAventura> listaFilmes = new ArrayList<> (List.of(new FilmeAventura("T.B", 10.90, Categoria.FANTASIA), new FilmeAventura("P.B", 15.90, Categoria.SUSPENSE), new FilmeAventura("M.R", 5.90, Categoria.SUSPENSE)));
	
	public static void main(String[] args) {
		Map<Categoria, List<FilmeAventura>> categoriaFilmeMap = new HashMap<>();
		List<FilmeAventura> fantasia = new ArrayList<>();
		List<FilmeAventura> terror = new ArrayList<>();
		List<FilmeAventura> suspense = new ArrayList<>();
		
		for(FilmeAventura fa: listaFilmes) {
			switch(fa.getCategoria()) {
				case TERROR: terror.add(fa);
				case SUSPENSE: suspense.add(fa);
				case FANTASIA: fantasia.add(fa);
			}
		}
		
		categoriaFilmeMap.put(Categoria.SUSPENSE, suspense);
		categoriaFilmeMap.put(Categoria.TERROR, terror);
		categoriaFilmeMap.put(Categoria.FANTASIA, fantasia);
		System.out.println(categoriaFilmeMap);
		
		Map<Categoria, List<FilmeAventura>> collect = listaFilmes.stream().collect(Collectors.groupingBy(FilmeAventura::getCategoria));
		System.out.println(collect);
	}
}