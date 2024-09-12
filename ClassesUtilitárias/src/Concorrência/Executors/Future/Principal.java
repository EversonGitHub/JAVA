package Concorrência.Executors.Future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Principal {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<Double> dollarRequest = es.submit(() ->{
			TimeUnit.SECONDS.sleep(2);
			return 4.35D;
		});
		System.out.println(doSomething());
		Double dollarResponse = dollarRequest.get();
		System.out.println(dollarRequest);
		System.out.println("Dolar: " + dollarResponse);
		es.shutdown();
	}
	
	private static long doSomething() {
		System.out.println(Thread.currentThread().getName());
		long sum = 0;
		for(int i = 0; i < 1_000_000; i++) {
			sum += 1;
		}
		return sum;
	}
}