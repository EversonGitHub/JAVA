package ClassesInternas.ClasseAninhadaEstática;

public class Principal {
		private String nome = "Antonio";
		
		static class Nested{
			private String sobrenome = "Lima";
			
			void print() {
				System.out.println(new Principal().nome + " " + sobrenome);
			}
		}
	
	public static void main(String[] args) {
		Nested n = new Principal.Nested();
		n.print();
	}
}