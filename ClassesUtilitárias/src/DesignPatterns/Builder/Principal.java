package DesignPatterns.Builder;

public class Principal {

	public static void main(String[] args) {
		Person build = new Person.PersonBuilder().name("Ricardo").lastName("Quaresma").userName("ricardoquaresma").email("ricardoquaresma@gmail.com").build();
		System.out.println(build);
	}
}