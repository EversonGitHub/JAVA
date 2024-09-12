package Concorrência.Executors.CompletableFuture.GetAndJoin;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Principal {

	public static void main(String[] args) {
		Service s = new Service();
		searchPriceSync(s);
		searchPriceASyncFuture(s);
		searchPriceASyncCompletableFuture(s);
	}
	
	private static void searchPriceSync(Service s) {
		long start = System.currentTimeMillis();
		System.out.println(s.getPriceSync("Service 1"));
		System.out.println(s.getPriceSync("Service 2"));
		System.out.println(s.getPriceSync("Service 3"));
		System.out.println(s.getPriceSync("Service 4"));
		long end = System.currentTimeMillis();
		System.out.printf("Tempo para busca de preço %d%n", (end - start));
		
	}
	
	private static void searchPriceASyncFuture(Service s) {
		long start = System.currentTimeMillis();
		Future<Double> pasf = s.getPricesASyncFuture("Service 1");
		Future<Double> pasf2 = s.getPricesASyncFuture("Service 2");
		Future<Double> pasf3 = s.getPricesASyncFuture("Service 3");
		Future<Double> pasf4 = s.getPricesASyncFuture("Service 4");
		
		try {
			System.out.println(pasf.get());
			System.out.println(pasf2.get());
			System.out.println(pasf3.get());
			System.out.println(pasf4.get());
		}catch(InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.printf("Tempo para busca de preço %d%n", (end - start));
		s.shutdown();
	}
	
	private static void searchPriceASyncCompletableFuture(Service s) {
		long start = System.currentTimeMillis();
		CompletableFuture<Double> pasf = s.getPricesASyncCompletableFuture("Service 1");
		CompletableFuture<Double> pasf2 = s.getPricesASyncCompletableFuture("Service 2");
		CompletableFuture<Double> pasf3 = s.getPricesASyncCompletableFuture("Service 3");
		CompletableFuture<Double> pasf4 = s.getPricesASyncCompletableFuture("Service 4");
		
		try {
			System.out.println(pasf.get());
			System.out.println(pasf2.get());
			System.out.println(pasf3.get());
			System.out.println(pasf4.get());
		}catch(InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.printf("Tempo para busca de preço %d%n", (end - start));
		s.shutdown();
	}
}