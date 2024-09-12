package Concorrência.Executors.ScheduledExecutorService;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Principal {
	private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	
	private static void beeper() {
		Runnable r = () -> {
			System.out.println(LocalTime.now() + "beep.");
		};
		executor.schedule(r, 4, TimeUnit.SECONDS);
		ScheduledFuture<?> swfd = executor.scheduleWithFixedDelay(r, 1, 3, TimeUnit.SECONDS);
		executor.schedule( () -> {
			System.out.println("Cancelando o scheduleWithFixedDelay");
			swfd.cancel(false);
			executor.shutdown();
		}, 3, TimeUnit.SECONDS);
	}
	
	public static void main(String[] args) {
		System.out.println(LocalTime.now().format(formatter));
		beeper();
	}
}