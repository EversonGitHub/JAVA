package MétodoReference.Constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

import MétodoReference.Estático.Serie;
import MétodoReference.Estático.Services.SerieComparator;

public class Principal {

	public static void main(String[] args) {
		Supplier<SerieComparator> newSerieComparator = SerieComparator::new;
		SerieComparator sc = newSerieComparator.get();
		List<Serie> serieLista = new ArrayList<>(List.of(new Serie("P.B", 20), new Serie("M.R", 45)));
		
		serieLista.sort(SerieComparator::compararPorEpisodios);
		
		System.out.println(serieLista);
		
		BiFunction<String, Integer, Serie> serieBiFunction = (titulo, episodios) -> new Serie(titulo, episodios);
		BiFunction<String, Integer, Serie> serieBiFunction2 = Serie::new;
		System.out.println(serieBiFunction2.apply("AHH", 118));
	}
}