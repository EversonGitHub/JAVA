package Threads.Deadlock;

public class Principal {

	public static void main(String[] args) {
		Object lock = new Object();
		Object lock2 = new Object();
		Runnable r = () -> {
			synchronized(lock) {
				System.out.println("Thread1: Segurando lock.");
				System.out.println("Thread1: Segurando lock2.");
				synchronized(lock2) {
					System.out.println("Thread1: Segurando lock2.");
				}
			}
		};
		
		Runnable r2 = () -> {
			synchronized(lock2) {
				System.out.println("Thread2: Segurando lock2.");
				System.out.println("Thread2: Segurando lock.");
				synchronized(lock) {
					System.out.println("Thread2: Segurando lock.");
				}
			}
		};
		new Thread(r).start();
		new Thread(r2).start();
	}
}