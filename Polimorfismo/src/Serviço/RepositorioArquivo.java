package Serviço;

import Repositório.Repositorio;

public class RepositorioArquivo implements Repositorio{
	@Override
	public void salvar() {
		System.out.println("Salvando um arquivo.");
	}
}