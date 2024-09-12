package ClassesInternas.Introdução;

import ClassesInternas.Introdução.OuterClass.Inner;

public class OuterClass {
	private String nome = "São Paulo Futebol Clube.";
	
	class Inner{
		public void printOuterClass() {
			System.out.println(nome);
			System.out.println(this);
			System.out.println(OuterClass.this);
		}
	}
	
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		Inner i = oc.new Inner();
		i.printOuterClass();
	}
}