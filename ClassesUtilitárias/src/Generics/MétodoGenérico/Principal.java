package Generics.MétodoGenérico;

import java.util.List;

import Generics.ClassesGenéricas.Classes.Barco;

public class Principal {

	public static void main(String[] args) {
		List<Barco> bl = criarArrayComUmObjeto(new Barco("Teste barco"));
		System.out.println(bl);
	}

	private static <T> List<T> criarArrayComUmObjeto(T t) {
		return List.of(t);
	}
}