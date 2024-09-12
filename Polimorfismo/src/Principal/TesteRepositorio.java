package Principal;

import Repositório.Repositorio;
import Serviço.RepositorioBD;

public class TesteRepositorio {

	public static void main(String[] args) {
		Repositorio repositorio = new RepositorioBD();
		repositorio.salvar();
	}
}