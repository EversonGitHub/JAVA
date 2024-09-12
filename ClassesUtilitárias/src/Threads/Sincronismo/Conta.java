package Threads.Sincronismo;

public class Conta {
	private double saldo = 100;

	public void saque(double s) {
		this.saldo = this.saldo - s;
	}
	
	public double getSaldo() {
		return saldo;
	}
}