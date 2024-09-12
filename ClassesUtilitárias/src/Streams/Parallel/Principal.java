package Streams.Parallel;

import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		long n = 10000000;
		sumFor(n);
		sumStreamIterate(n);
	}
	
	private static void sumFor(long n) {
		System.out.println("Sum for.");
		long result = 0;
		long init = System.currentTimeMillis();
		for(long i = 1; i <= n; i++) {
			result += i;
		}
		long end = System.currentTimeMillis();
		System.out.println(result + " " + (end - init) + " ms.");
	}
	
	private static void sumStreamIterate(long n) {
		System.out.println("Sum for.");
		long result = 0;
		long init = System.currentTimeMillis();		
		Stream.iterate(1L, i -> i + 1).limit(n).reduce(0L, Long::sum);
		long end = System.currentTimeMillis();
		System.out.println(result + " " + (end - init) + " ms.");
	}
	
	private static void sumParallelStreamIterate(long n) {
		System.out.println("Sum for.");
		long result = 0;
		long init = System.currentTimeMillis();		
		Stream.iterate(1L, i -> i + 1).parallel().limit(n).reduce(0L, Long::sum);
		long end = System.currentTimeMillis();
		System.out.println(result + " " + (end - init) + " ms.");
	}
}