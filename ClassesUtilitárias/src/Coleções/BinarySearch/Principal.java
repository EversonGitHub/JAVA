package Coleções.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(10);
		numeros.add(15);
		
		Collections.sort(numeros);
		System.out.println(Collections.binarySearch(numeros, 0));
		System.out.println(Collections.binarySearch(numeros, -1));
		
	}
}