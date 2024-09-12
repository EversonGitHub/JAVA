package ComportamentosParametrizados;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	private static List<Carro> carros = List.of(new Carro("Verde", 2015), new Carro("Vermelho", 2016), new Carro("Preto", 2018));
	
	public static void main(String[] args) {
		System.out.println(filtroCarrosVerde(carros));
		System.out.println(filtrarCarroPorCor(carros, "verde"));
		System.out.println(filtrarCarroPorCor(carros, "vermelho"));
		System.out.println(filtrarCarroPorAno(carros, 2016));
	}
	
	private static List<Carro> filtroCarrosVerde(List<Carro> carros){
		List<Carro> filtrarCarros = new ArrayList<>();
		for(Carro c: carros) {
			if(c.getNome().equals("verde")) {
				filtrarCarros.add(c);
			}
		}
		return filtrarCarros;
	}
	
	private static List<Carro> filtrarCarroPorCor(List<Carro> carros, String cor){
		List<Carro> filtrarCarros = new ArrayList<Carro>();
		for(Carro c: carros) {
			if(c.getCor().equals(cor)) {
				filtrarCarros.add(c);
			}
		}
		return filtrarCarros;
	}
	
	private static List<Carro> filtrarCarroPorAno(List<Carro> carros, int ano){
		List<Carro> filtrarCarros = new ArrayList<Carro>();
		for(Carro c: carros) {
			if(c.getAno() < ano) {
				filtrarCarros.add(c);
			}
		}
		return filtrarCarros;
	}
}