package Concorrência.Lock_ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Principal {

	static class Worker implements Runnable{
		private String nome;
		private ReentrantLock lock;
		
		public Worker(String nome, ReentrantLock lock) {
			this.nome = nome;
			this.lock = lock;
		}
		
		@Override
		public void run() {
			lock.lock();
			try {
				if(lock.isHeldByCurrentThread()) {
					System.out.printf("Thread %s entrou em uma sessão crítica.%n", nome);
				}
				System.out.printf("%d Threads esperando na fila.%n", lock.getQueueLength());
				Thread.sleep(2000);
				System.out.printf("Thread %s finalizou.%n", nome);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}finally {
				lock.unlock();
			}
		}
	} 
	
	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();
		new Thread(new Worker("A", lock)).start();
		new Thread(new Worker("B", lock)).start();
		new Thread(new Worker("C", lock)).start();
		new Thread(new Worker("D", lock)).start();
		new Thread(new Worker("E", lock)).start();
		new Thread(new Worker("F", lock)).start();
		new Thread(new Worker("G", lock)).start();
	}
}