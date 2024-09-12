package Concorrência.Executors.CompletableFuture.Streams;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import Concorrência.Executors.CompletableFuture.GetAndJoin.Service;

public class Principal {

	public static void main(String[] args) {
		Service s = new Service();
		searchPriceASyncCompletableFuture(s);
	}
	
	private static void searchPriceASyncCompletableFuture(Service s) {
		long start = System.currentTimeMillis();
		List<String> stores = List.of("Service1", "Service2", "Service3", "Service4");
		
		List<CompletableFuture<Double>> cf = stores.stream().map(s::getPricesASyncCompletableFuture).collect(Collectors.toList());
		
		List<Double> prices = cf.stream().map(CompletableFuture::join).collect(Collectors.toList());
		System.out.println(prices);
		
		long end = System.currentTimeMillis();
		System.out.printf("Tempo para busca de preço %d%n", (end - start));
	}
}