package Generics.ClassesGenéricas.Main;

import Generics.ClassesGenéricas.Classes.Barco;
import Generics.ClassesGenéricas.Serviços.BarcoRentavel;

public class Principal {

	public static void main(String[] args) {
		BarcoRentavel br = new BarcoRentavel();
		Barco b = BarcoRentavel.buscarBarcoDisponivel();
		System.out.println("Barco alugado por 15 dias.");
		BarcoRentavel.retornarBarcoAlugado(b);
	}
}