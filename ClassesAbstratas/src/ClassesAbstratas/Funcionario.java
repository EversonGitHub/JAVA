package ClassesAbstratas;

public abstract class Funcionario extends Pessoa {
	protected String nome;
	protected double salario;
	
	public Funcionario(String n, double s){
		this.nome = n;
		this.salario = s;
		calcularBonus();
	}
	
	@Override 
	public void imprime(){
		System.out.println("Imprimindo o método abstrato de Pessoa, na outra classe abstrata extendida.");
	}
	
	public abstract void calcularBonus();
}