package Lambdas.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Principal {

	public static void main(String[] args) {
		List<String> strings = List.of("Tommy", "Arthur");
		List<Integer> integers = map(strings, (String s) -> s.length()); 
		List<String> map = map(strings, s -> s.toUpperCase());
		
		System.out.println(integers);
		System.out.println(map);
	}

	private static <T, R> List<R> map(List<T> lista, Function<T, R> f) {
		List<R> result = new ArrayList<>();
		for(T e: lista) {
			R r = f.apply(e);
			result.add(r);
		}
		return result;
	}	
}