package Concorrência.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	private int count;
	private AtomicInteger ai = new AtomicInteger();
		void increment() {
			count++;
			ai.incrementAndGet();
		}
		
		public int getCount() {
			return count;
		}

		public AtomicInteger getAi() {
			return ai;
		}
}