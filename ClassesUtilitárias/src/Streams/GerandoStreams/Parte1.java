package Streams.GerandoStreams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Parte1 {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 50).filter(n -> n%2 ==0).forEach(n -> System.out.print(n + " "));
		System.out.println();
		IntStream.range(1, 50).filter(n -> n%2 ==0).forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		Stream.of("Esse ", "texto ", "é ", "um ", "teste.").map(String::toUpperCase).forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		int num[] = {1,2,3,4,5};
		Arrays.stream(num).average().ifPresent(System.out::println);
	}
}