package Generics.Wildcard;

import java.util.List;

public class Wildcard2 {

	public static void main(String[] args) {
		List<Cachorro> cachorro = List.of(new Cachorro(), new Cachorro());
		List<Papagaio> papagaio = List.of(new Papagaio(), new Papagaio());
	}
	
	private static void printConsulta(List<Animal> animais) {
		for(Animal animal: animais) {
			animal.consulta();
		}
		animais.add(new Cachorro());
	}
}