package Concorrência.CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Principal {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		for(int i = 0; i < 500; i++) {
			lista.add(i);
		}
		
		Runnable r = () -> {
			Iterator<Integer> iterator = lista.iterator();
			try {
				TimeUnit.SECONDS.sleep(2);
				iterator.forEachRemaining(System.out::println);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Runnable runnableRemover = () -> {
			for(int i = 0; i < 500; i++) {
				System.out.printf("%s removido.%d%n", Thread.currentThread().getName(), i);
			}
		};
		
		new Thread(r).start();
		new Thread(r).start();
		new Thread(runnableRemover).start();
	}
}