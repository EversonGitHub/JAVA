package Dominio;

public class Chocolate extends Produto{
	public static final double PORCENTAGEM_IMPOSTO = 0.10;
	private String dataValidade;

	public Chocolate(String nome, double valor) {
		super(nome, valor);
	}
	
	@Override
	public double calcularImposto(){
		System.out.println("Calculando imposto do chocolate.");
		return this.valor * PORCENTAGEM_IMPOSTO;
	}
	
	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
}