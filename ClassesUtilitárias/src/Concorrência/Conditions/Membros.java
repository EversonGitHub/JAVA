package Concorrência.Conditions;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Membros {
	private final Queue<String> emails = new ArrayBlockingQueue<>(10);
	private final ReentrantLock lock = new ReentrantLock();
	private final Condition condition = lock.newCondition();
	private boolean open = true;
	
	public boolean isOpen() {
		return open;
	}
	
	public int pendingEmails() {
		lock.lock();
		try {
			return emails.size();
		}finally {
			lock.unlock();
		}
	}
	
	public void addMembersEmail(String email) {
		lock.lock();
		try {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + "Adicionou um email na lista.");
			this.emails.add(email);
			condition.signalAll();
		}finally {
			lock.unlock();
		}
	}
	
	public String retrieveEmail() throws InterruptedException{
		System.out.println(Thread.currentThread().getName() + " checando se há emails.");
		lock.lock();
		try {
			while(this.emails.size() == 0) {
				if(!open) break; 
					System.out.println(Thread.currentThread().getName() + " não há emails disponíveis na lista. Entrando em modo de espera.");
					condition.await();
				}
				return this.emails.poll();
			}finally {
				lock.unlock();
			}
		}
	
	public void close() {
		open = false;
		lock.lock();
		try {
			System.out.println(Thread.currentThread().getName() + " notificando todos os membros. Não recebemos mais emails.");
			condition.signalAll();
		}finally {
			lock.unlock();
		}
	}
}