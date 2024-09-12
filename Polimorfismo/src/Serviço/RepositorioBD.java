package Serviço;

import Repositório.Repositorio;

public class RepositorioBD implements Repositorio{
	@Override
	public void salvar() {
		System.out.println("Salvando no banco de dados.");
	}
}