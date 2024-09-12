package Generics.ClassesGenéricas.Serviços;

import java.util.ArrayList;
import java.util.List;

import Generics.ClassesGenéricas.Classes.Carro;

public class CarroRentavel {
	private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Camaro")));
	
	public Carro buscarCarroDisponivel() {
		System.out.println("Buscando carro disponível...");
		Carro c = carrosDisponiveis.remove(0);
		System.out.println("Alugando carro: " + c);
		System.out.println("Carros disponíveis para alugar:");
		System.out.println(carrosDisponiveis);
		return c;
	}
	
	public void retornarCarroAlugado(Carro c) {
		System.out.println("Devolvendo carro " + c + ".");
		carrosDisponiveis.add(c);
		System.out.println("Carros disponíveis para alugar.");
		System.out.println(carrosDisponiveis);
	}
}
