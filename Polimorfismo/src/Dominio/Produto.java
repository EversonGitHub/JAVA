package Dominio;

public abstract class Produto implements Taxas{
	protected String nome;
    protected double valor;
	
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}
}