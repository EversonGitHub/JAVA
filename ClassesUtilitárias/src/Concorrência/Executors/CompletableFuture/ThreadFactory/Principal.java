package Concorrência.Executors.CompletableFuture.ThreadFactory;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		ServiceDeprecated sd = new ServiceDeprecated();
		searchPriceASyncCompletableFuture(sd);
	}
	
	private static void searchPriceASyncCompletableFuture(ServiceDeprecated sd) {
		long start = System.currentTimeMillis();
		ExecutorService e = Executors.newFixedThreadPool(3);
		List<String> stores = List.of("Service1", "Service2", "Service3", "Service4");
		List<CompletableFuture<Double>> cf = stores.stream().map(s -> CompletableFuture.supplyAsync(() -> sd.getPriceSync(s), e)).collect(Collectors.toList());
		
		List<Double> prices = cf.stream().map(CompletableFuture::join).collect(Collectors.toList());
		System.out.println(prices);
		
		long end = System.currentTimeMillis();
		System.out.printf("Tempo para busca de preço %d%n", (end - start));
	}
}