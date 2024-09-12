package Principal;

import Dominio.Chocolate;
import Dominio.Computador;
import Dominio.Produto;

public class Teste {

	public static void main(String[] args) {
		Produto produto = new Computador("Eniac 2", 25000);
		System.out.println(produto.getNome());
		System.out.println(produto.getValor());
		System.out.println("---------");
		Produto produto2 = new Chocolate("Shot", 11);
		System.out.println(produto2.getNome());
		System.out.println(produto2.getValor());
	}
}