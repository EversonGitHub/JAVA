package Generics.ClassesGenéricas.RentalService;

import java.util.ArrayList;
import java.util.List;

import Generics.ClassesGenéricas.Classes.Barco;
import Generics.ClassesGenéricas.Classes.Carro;

public class Principal {

	public static void main(String[] args) {
		List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Lancha")));
		List<Carro> CarrosDisponiveis = new ArrayList<>(List.of(new Carro("Camaro"), new Carro("Fusca")));
		RentalService<Carro> rs = new RentalService<Carro>(CarrosDisponiveis);
	}
}