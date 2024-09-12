package Serviço;

import Dominio.Chocolate;
import Dominio.Produto;

public class CalculadoraImposto {

	public static void calcularImpostos(Produto produto) {
		System.out.println("=== Relatório de impostos ===");
		double imposto = produto.calcularImposto();
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Preço: " + produto.getValor());
		System.out.println("Total de impostos sob produto: " + imposto);
		
		if(produto instanceof Chocolate){
			Chocolate chocolate = (Chocolate) produto;
			System.out.println(chocolate.getDataValidade());
		}
	}
}