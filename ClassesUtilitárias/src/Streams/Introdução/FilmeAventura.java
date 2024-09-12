package Streams.Introdução;

import Streams.Collectors.GroupingBy.Categoria;

public class FilmeAventura {
	private String titulo;
	private double preco;
	private Categoria categoria;
	
	public FilmeAventura(String t, double p) {
		titulo = t;
		preco = p;
	}
	
	public FilmeAventura(String t, double p, Categoria c) {
		titulo = t;
		preco = p;
		categoria = c;
	}

	@Override
	public String toString() {
		return "FilmeAventura - Titulo: " + titulo + ".\nPreço: " + preco + ".\nCategoria: " + categoria + ".";
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}
}