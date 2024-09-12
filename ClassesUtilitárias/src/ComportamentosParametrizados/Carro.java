package ComportamentosParametrizados;

public class Carro {
	private String nome = "Audi";
	private String cor;
	private int ano;
	
	public Carro(String c, int a) {
		cor = c;
		ano = a;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Carro - Nome: " + nome + ".\nCor: " + cor + ".\nAno: " + ano + ".";
	}
}