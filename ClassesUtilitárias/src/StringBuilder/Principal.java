package StringBuilder;

public class Principal {

	public static void main(String[] args) {
		String nome = "Lionel Messi.";
		nome.concat("Andrés");
		System.out.println(nome);
		StringBuilder sb = new StringBuilder("Lionel ");
		sb.append("Andrés ").append("Messi.");
		sb.reverse();
		sb.reverse();
		//sb.delete(0, 3);
		System.out.println(sb);
	}
}