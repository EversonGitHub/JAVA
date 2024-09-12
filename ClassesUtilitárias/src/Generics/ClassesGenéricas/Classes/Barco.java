package Generics.ClassesGenéricas.Classes;

public class Barco {
	private String nome;
	
	public Barco(String n) {
		nome = n;
	}

	@Override
	public String toString() {
		return "Barco - Nome: " + nome + ".";
	}
}