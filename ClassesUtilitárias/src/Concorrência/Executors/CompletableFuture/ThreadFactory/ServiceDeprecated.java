package Concorrência.Executors.CompletableFuture.ThreadFactory;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ServiceDeprecated {
	public double getPriceSync(String storeName){
		System.out.printf("Gerando preços %s%n", storeName);
		return priceGenerator();
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