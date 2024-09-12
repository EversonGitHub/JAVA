package Concorrência.Executors.ThreadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Printer implements Runnable{
	private final int num;
	
	public Printer(int n) {
		num = n;
	}
	
	@Override
	public void run() {
		System.out.printf("%s início: %d%n", Thread.currentThread().getName(), num);
		try {
			TimeUnit.SECONDS.sleep(3);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("%s finalizou.%n", Thread.currentThread().getName());
	}
}

public class Principal {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(4);
		es.execute(new Printer(1));
		es.execute(new Printer(2));
		es.execute(new Printer(3));
		es.execute(new Printer(4));
		es.execute(new Printer(5));
		es.execute(new Printer(6));
		es.shutdown();
		System.out.println("Programa finalizado.");
	}
}