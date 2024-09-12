package Coleções.SortingLists;

import java.util.Objects;

public class Filme {
	private long id;
	private String nome;
	private double preco;
	
	public Filme(long id, String n, double p) {
		Objects.requireNonNull(id, "Id não pode ser nulo.");
		this.id = id;
		nome = n;
		preco = p;
	}
	
	@Override
	public String toString() {
		return "Filme - id: " + id + ".\n Nome: " + nome + ". Preço: " + preco + ".";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filme other = (Filme) obj;
		return id == other.id && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco);
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}