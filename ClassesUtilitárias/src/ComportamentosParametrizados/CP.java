package ComportamentosParametrizados;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CP {
	private static List<Carro> carros = List.of(new Carro("Verde", 2015), new Carro("Vermelho", 2016), new Carro("Preto", 2018));
	
	public static void main(String[] args) {
		List<Carro> carrosVerde = filtrar(carros, carro -> carro.getCor().equals("Verde."));
		List<Carro> carrosVermelho = filtrar(carros, carro -> carro.getCor().equals("Vermelho."));
		List<Carro> carrosPreto = filtrar(carros, carro -> carro.getCor().equals("Preto."));
		List<Carro> carroAno = filtrar(carros, carro -> carro.getAno() <- 2019);
		
		System.out.println(carrosVerde);
		System.out.println(carrosVermelho);
		System.out.println(carrosPreto);
		System.out.println(carroAno);
		
		List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println(filtrar(numeros, n -> n % 2 == 0));
}
	
	private static <T> List<T> filtrar(List<T> lista, Predicate<T> p){
		List<T> filtrarLista = new ArrayList<>();
		for(T e: lista) {
			if(p.test(e)) {
				filtrarLista.add(e);
			}
		}
		return filtrarLista;
	}
}