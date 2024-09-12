package Concorrência.ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
		bq.put("William");
		System.out.printf("%s valor adicionado %s%n", Thread.currentThread().getName(), bq.peek());
		System.out.println("Tentando adicionar outro valor.");
		new Thread(new RemoveFromQueue(bq)).start();
		bq.put("Solange");
		System.out.printf("%s valor adicionado %s%n", Thread.currentThread().getName(), bq.peek());
	}
	
	static class RemoveFromQueue implements Runnable{
		private final BlockingQueue<String> bq;
		
		public RemoveFromQueue(BlockingQueue<String> bq) {
			this.bq = bq;
		}
		
		@Override
		public void run() {
			System.out.printf("%s indo dormir por 2 segundos %n", Thread.currentThread().getName());
			try {
				TimeUnit.SECONDS.sleep(5);
				System.out.printf("%s removendo valor da fila %s%n", Thread.currentThread().getName(), bq.take());
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}