package Concorrência.Executors.InterfaceCallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

class RandomNumberCallable implements Callable<String>{
	@Override
	public String call() throws Exception{
		int num = ThreadLocalRandom.current().nextInt(1, 11);
		for(int i = 0; i < num; i++) {
			System.out.printf("%s executando uma tarefa callable...", Thread.currentThread().getName());
		}
		return String.format("%s finalizado e o número aleatório é %d", Thread.currentThread().getName(), num);
	}
}

public class Principal {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		RandomNumberCallable rnc = new RandomNumberCallable();
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<String> future = es.submit(rnc);
		String s = future.get();
		System.out.printf("Programa finalizado %s", s);
		es.shutdown();
	}
}