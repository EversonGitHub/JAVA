package Dominio;

public class Computador extends Produto{
	public static final double PORCENTAGEM_IMPOSTO = 0.20;
	
	public Computador(String nome, double valor) {
		super(nome, valor);
	}
	
	@Override
	public double calcularImposto() {
		System.out.println("Calculando imposto do computador.");
		return this.valor * PORCENTAGEM_IMPOSTO;
		
	}
}