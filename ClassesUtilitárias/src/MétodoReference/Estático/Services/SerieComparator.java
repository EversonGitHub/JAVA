package MétodoReference.Estático.Services;

import MétodoReference.Estático.Serie;

public class SerieComparator {
	public static int compararPorTitulo(Serie s1, Serie s2){
		return s1.getTitulo().compareTo(s2.getTitulo()); 
	}
	
	public static int compararPorEpisodios(Serie s1, Serie s2) {
		return Integer.compare(s1.getEpisodios(), s2.getEpisodios());
	}
}
