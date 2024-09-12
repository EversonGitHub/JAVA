package Coleções.NavigableSet;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import Coleções.Equals.Smartphone;

public class Principal {

	public static void main(String[] args) {
		NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
		Smartphone smartphone = new Smartphone("1246", "Xiaomi");
		set.add(smartphone);
		System.out.println(set);

	}
}

class SmartphoneMarcaComparator implements Comparator<Smartphone>{
	@Override
	public int compare(Smartphone s1, Smartphone s2) {
		return s1.getMarca().compareTo(s2.getMarca());
	}
}