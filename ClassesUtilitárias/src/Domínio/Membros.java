package Domínio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Membros {
	private final Queue<String> emails = new ArrayBlockingQueue<>(10);
	private boolean open = true;
	
	public boolean isOpen() {
		return open;
	}
	
	public int pendingEmails() {
		synchronized (emails) {
			return emails.size();
		}
	}
	
	public void addMembersEmail(String email) {
		synchronized(this.emails) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + "Adicionou um email na lista.");
			this.emails.add(email);
			this.emails.notifyAll();
		}
	}
	
	public String retrieveEmail() throws InterruptedException{
		System.out.println(Thread.currentThread().getName() + " checando se há emails.");
		synchronized (emails) {
			while(this.emails.size() == 0) {
				if(!open) break; 
					System.out.println(Thread.currentThread().getName() + " não há emails disponíveis na lista. Entrando em modo de espera.");
					this.emails.wait();
				}
				return this.emails.poll();
			}
		}
	
	public void close() {
		open = false;
		synchronized (emails) {
			System.out.println(Thread.currentThread().getName() + " notificando todos os membros. Não recebemos mais emails.");
		}
	}
}