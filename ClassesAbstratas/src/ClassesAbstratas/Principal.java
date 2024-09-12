package ClassesAbstratas;

public class Principal {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Leonardo", 2300);
		System.out.println(gerente);
		
		Desenvolvedor desenvolvedor = new Desenvolvedor("Everson", 10000);
		System.out.println(desenvolvedor);
		
		desenvolvedor.imprime();
		gerente.imprime();
		
	}
}