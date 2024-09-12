package Lambdas.Consumer;

import java.util.List;
import java.util.function.Consumer;

public class Principal {

	public static void main(String[] args) {
		List<String>  strings = List.of("Messi", "Neymar", "Iniesta", "CR7", "R9");
		List<Integer> integers = List.of(10, 11, 8, 7, 9);
		
		forEach(strings, s -> System.out.println(s));
		forEach(integers, i -> System.out.println(i));
	}

	private static <T> void forEach(List<T> lista, Consumer<T> c) {
		for(T e: lista) {
			c.accept(e);
		}
	}
}