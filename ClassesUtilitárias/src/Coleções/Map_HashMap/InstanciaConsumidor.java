package Coleções.Map_HashMap;

import java.util.HashMap;
import java.util.Map;

import Coleções.SortingLists.Filme;

public class InstanciaConsumidor {

	public static void main(String[] args) {
		Consumidor c1 = new Consumidor("Felipe.");
		Consumidor c2 = new Consumidor("Alonso.");

		Filme f1 = new Filme(5L, "Van Helsing.", 28.90);
		Filme f2 = new Filme(2L, "Harry Potter.", 28.50);
		Filme f3 = new Filme(1L, "Blade.", 20.00);
		Filme f4 = new Filme(4L, "60 segundos.", 19.90);
		Filme f5 = new Filme(3L, "De volta para o futuro.", 10.90);
		
		Map<Consumidor, Filme> consumidorFilme = new HashMap<>();
		consumidorFilme.put(c2, f5);
		consumidorFilme.put(c1, f3);
		for(Map.Entry<Consumidor, Filme> entry: consumidorFilme.entrySet()) {
			System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
		}
	}
}