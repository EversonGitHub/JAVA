package Concorrência.AtomicInteger;

public class Principal {
	
	public static void main(String[] args) throws InterruptedException{
		Counter c = new Counter();
		Runnable r = () -> {
			for(int i = 0; i < 10000; i++) {
				c.increment();
			}
		};
		Thread t = new Thread(r);
		Thread t2 = new Thread(r);
		t.start();
		t2.start();
		
		t.join();
		t2.join();
		System.out.println(c.getCount());
		System.out.println(c.getAi());
	}
}