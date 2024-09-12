package Generics.ClassesGenéricas.Serviços;

import java.util.ArrayList;
import java.util.List;

import Generics.ClassesGenéricas.Classes.Barco;

public class BarcoRentavel {
	private static List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Lancha")));
	
	public static Barco buscarBarcoDisponivel() {
		System.out.println("Buscando barco disponível...");
		Barco b = barcosDisponiveis.remove(0);
		System.out.println("Alugando barco: " + b);
		System.out.println("Barcos disponíveis para alugar:");
		System.out.println(barcosDisponiveis);
		return b;
	}
	
	public static void retornarBarcoAlugado(Barco c) {
		System.out.println("Devolvendo barco " + c + ".");
		barcosDisponiveis.add(c);
		System.out.println("Barcos disponíveis para alugar.");
		System.out.println(barcosDisponiveis);
	}
}
