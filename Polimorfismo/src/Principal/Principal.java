package Principal;

import Dominio.Chocolate;
import Dominio.Computador;
import Dominio.Televisão;
import Serviço.CalculadoraImposto;

public class Principal {
	public static void main(String[] args) {
		Computador computador = new Computador("Eniac", 20000);
		Chocolate chocolate = new Chocolate("Diamante negro", 10);
		chocolate.setDataValidade("02/11/2024");;
		Televisão tv = new Televisão("LG Smart TV 4k", 8000);
		
		CalculadoraImposto.calcularImpostos(chocolate);
		System.out.println("--------------------------------");
		CalculadoraImposto.calcularImpostos(computador);
		System.out.println("--------------------------------");
		CalculadoraImposto.calcularImpostos(tv);
	}
}