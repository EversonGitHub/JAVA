package Coleções.Map_HashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Coleções.SortingLists.Filme;

public class InstanciaConsumidor2 {

	public static void main(String[] args) {
		Consumidor c1 = new Consumidor("Felipe.");
		Consumidor c2 = new Consumidor("Alonso.");

		Filme f1 = new Filme(5L, "Van Helsing.", 28.90);
		Filme f2 = new Filme(2L, "Harry Potter.", 28.50);
		Filme f3 = new Filme(1L, "Blade.", 20.00);
		Filme f4 = new Filme(4L, "60 segundos.", 19.90);
		Filme f5 = new Filme(3L, "De volta para o futuro.", 10.90);
		
		List<Filme> filmeConsumidorLista = List.of(f1, f2, f3);
		List<Filme> filmeConsumidorLista2 = List.of(f4, f5);
		
		Map<Consumidor, List<Filme>> consumidorFilmeMap = new HashMap<>();
		consumidorFilmeMap.put(c2, filmeConsumidorLista2);
		consumidorFilmeMap.put(c1, filmeConsumidorLista);
		
		for(Map.Entry<Consumidor, List<Filme>> entry: consumidorFilmeMap.entrySet()) {
			System.out.println("---" + entry.getKey().getNome() + "---");
			for(Filme filme: entry.getValue()) {
				System.out.println(filme.getNome());
			}
			System.out.println("");
		}
		
	}
}