package Concorrência.Executors.CompletableFuture.GetAndJoin;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Service {
	private static final ExecutorService es = Executors.newCachedThreadPool();
	
	public double getPriceSync(String storeName){
		System.out.printf("Gerando preços %s%n", storeName);
		return priceGenerator();
	}
	
	public Future<Double> getPricesASyncFuture(String storeName){
		System.out.printf("Pegando preços %s%n", storeName);
		return es.submit(this::priceGenerator);
	}
	
	public CompletableFuture<Double> getPricesASyncCompletableFuture(String storeName){
		System.out.printf("Pegando preços %s%n", storeName);
		return CompletableFuture.supplyAsync(this::priceGenerator);
	}
	
	public static void shutdown() {
		es.shutdown();
	}
	
	private double priceGenerator() {
		System.out.printf("%s gerando preço...%n", Thread.currentThread().getName());
		delay();
		return ThreadLocalRandom.current().nextInt(1, 500) *10;
	}
	
	private void delay() {
		try {
			TimeUnit.SECONDS.sleep(2);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}