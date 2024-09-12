package Runtime;

public class Principal {

	public static void main(String[] args) {
		try {
		divisao(1, 0);
		}catch(RuntimeException e){
			e.printStackTrace();
		}
		System.out.println("Código finalizado.");
	}
	
	private static int divisao(int a, int b) {
		if(b == 0){
			throw new IllegalArgumentException("Argumento ilegal. Impossivel dividir por 0.");
		}
		return a/b;
	}
}