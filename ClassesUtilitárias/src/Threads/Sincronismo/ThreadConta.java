package Threads.Sincronismo;

public class ThreadConta implements Runnable{
	private final Conta conta = new Conta();
	
	public static void main(String[] args) {
		ThreadConta tc = new ThreadConta();
		Thread t1 = new Thread(tc, "Felipe");
		Thread t2 = new Thread(tc, "Guilherme");
		t1.start();
		t2.start();
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			saque(10);
			if(conta.getSaldo() < 0) {
				System.out.println("Conta negativada.");
			}
		}
	}
	
	private void saque(double s) {
		synchronized(conta) {
			System.out.println(getThreadName() + " dentro do synchronized.");
		if(conta.getSaldo() >= s) {
			System.out.println(Thread.currentThread().getName() + " está indo sacar o dinheiro.");
			conta.saque(s);
			System.out.println(Thread.currentThread().getName() + " completou o saque. Valor atual da conta " + conta.getSaldo());
		}else {
			System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque " + conta.getSaldo());
		}
		
		}
	}
	
	private String getThreadName() {
		return Thread.currentThread().getName();
	}
}