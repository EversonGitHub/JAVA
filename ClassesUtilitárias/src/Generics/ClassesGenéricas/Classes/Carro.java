package Generics.ClassesGenéricas.Classes;

public class Carro {
	private String nome;
	
	public Carro(String n){
		nome = n;
	}

	@Override
	public String toString() {
		return "Carro - Nome: " + nome + ".";
	}
}