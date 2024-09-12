package Concorrência.LinkedTransferQueue;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		TransferQueue<Object> tq = new LinkedTransferQueue<>();
		System.out.println(tq.add("José"));
		System.out.println(tq.offer("José"));
		System.out.println(tq.offer("José", 10, TimeUnit.SECONDS));
		tq.put("Lima dos Santos");
		if(tq.hasWaitingConsumer()) {
			tq.transfer("Lima dos Santos");
		}
		System.out.println(tq.tryTransfer("Contador", 3, TimeUnit.SECONDS));
		System.out.println(tq.element());
		System.out.println(tq.peek());
		System.out.println(tq.poll());
		System.out.println(tq.remove());
		System.out.println(tq.remainingCapacity());
	}
}