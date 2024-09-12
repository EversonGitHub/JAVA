package Dominio;

public class Televisão extends Produto{
	public static final double PORCENTAGEM_IMPOSTO = 0.20;
	
	public Televisão(String nome, double valor) {
		super(nome, valor);
	}
	
	@Override
	public double calcularImposto() {
		System.out.println("Calculando imposto da televisão.");
		return this.valor * PORCENTAGEM_IMPOSTO;
	}		
}