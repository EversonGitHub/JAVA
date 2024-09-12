package Threads.Introdução;

public class Sleep {

	static class ThreadExample extends Thread{
		private final char c;
		
		public ThreadExample(char c) {
			this.c = c;
		}
		
		@Override
		public void run() {
			for(int i = 0; i < 400; i++) {
				System.out.println(c);
				if(i % 100 == 0) {
					System.out.println();
				}
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadExample t1 = new ThreadExample('A');
		ThreadExample t2 = new ThreadExample('B');
		ThreadExample t3 = new ThreadExample('C');
		ThreadExample t4 = new ThreadExample('D');
		t1.run();
		t2.run();
		t3.run();
		t4.run();
	}
}