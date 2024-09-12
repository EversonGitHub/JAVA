package MétodoReference.Estático;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import MétodoReference.Estático.Services.SerieComparator;

public class Principal {

	public static void main(String[] args) {
		List<Serie> listaSeries = new ArrayList<> (List.of(new Serie("P.B", 25), new Serie("Mr.Robot", 30)));
		Collections.sort(listaSeries, SerieComparator::compararPorTitulo);
		System.out.println(listaSeries);
		
	}
}