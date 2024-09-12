package ClassesInternas.ClassesLocais;

public class Principal {
	private String name = "Lionel";
	
	void print() {
		final String lastName = "Messi";
		class LocalClass{
			public void printLocal() {
				System.out.println(name + " " + lastName);
			}
		}
		new LocalClass().printLocal();
	}
	
	public static void main(String[] args) {
		Principal outer = new Principal();
		outer.print();
	}
}