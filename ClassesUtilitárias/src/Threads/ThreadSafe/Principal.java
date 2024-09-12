package Threads.ThreadSafe;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	static class ThreadSafeNames{
		private final List<String> names = (new ArrayList<>());
		
		public void add(String n) {
			names.add(n);
		}
		
		public synchronized void removeFirst() {
			if(names.size() > 0) {
				System.out.println(Thread.currentThread().getName());
				System.out.println(names.remove(0));
			}
		}
	}
		
	public synchronized static void main(String[] args) {
		ThreadSafeNames tsn = new ThreadSafeNames();
		tsn.add("Leonardo");
		Runnable r = tsn::removeFirst;
		new Thread(r).start();
		
	}
}