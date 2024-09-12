package Coleções.Equals;

public class Principal {

	public static void main(String[] args) {
		Smartphone s1 = new Smartphone("123ABC", "Iphone");
		Smartphone s2 = new Smartphone("456CDE", "Android");
		
		System.out.println(s1.equals(s2));
	}
}