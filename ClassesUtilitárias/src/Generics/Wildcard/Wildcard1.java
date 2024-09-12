package Generics.Wildcard;

abstract class Animal{
	public abstract void consulta();
}

class Cachorro extends Animal{
	@Override
	public void consulta(){
		System.out.println("Consultando catioro.");
	}
}

class Papagaio extends Animal {
	@Override
	public void consulta() {
		System.out.println("Consultando papagaio.");
	}
}



public class Wildcard1 {
	public static void main(String[] args) {
		Cachorro[] c = {new Cachorro(), new Cachorro()};
		Papagaio[] p = {new Papagaio(), new Papagaio()};
		printConsulta(p);
		printConsulta(c);
		System.out.println("--------------");
		
		Animal[] animais = {new Cachorro(), new Papagaio()};
		Animal animal = new Papagaio();
		printConsulta(animais);
	}
	
	public static void printConsulta(Animal[] animais) {
		for(Animal animal: animais) {
			animal.consulta();
		}
	}	
}
