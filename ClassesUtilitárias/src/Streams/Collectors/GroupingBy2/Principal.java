package Streams.Collectors.GroupingBy2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Streams.Collectors.GroupingBy.Categoria;
import Streams.Introdução.FilmeAventura;

public class Principal {
	private static List<FilmeAventura> listaFilmes = new ArrayList<> (List.of(new FilmeAventura("T.B", 10.90), new FilmeAventura("P.B", 15.90), new FilmeAventura("M.R", 5.90)));
	
	public static void main(String[] args) {
		Map<Promocao, List<FilmeAventura>> collect = listaFilmes.stream().collect(Collectors.groupingBy(ln -> {return ln.getPreco() < 10 ? Promocao.PROMOCAO:Promocao.PRECO_NORMAL;}));
		System.out.println(collect);
		
		Map<Categoria, Map<Promocao, List<FilmeAventura>>> collect2 = listaFilmes.stream().collect(Collectors.groupingBy(FilmeAventura::getCategoria, Collectors.groupingBy(ln -> ln.getPreco() < 6 ? Promocao.PROMOCAO:Promocao.PRECO_NORMAL)));
	}
}