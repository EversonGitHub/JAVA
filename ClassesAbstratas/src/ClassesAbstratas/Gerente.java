package ClassesAbstratas;

public class Gerente extends Funcionario{

	public Gerente(String n, double s) {
		super(n, s);
	}
	
	@Override
	public String toString() {
		return "Gerente [Nome= " + nome + ". Salário= " + salario + ".]";
	}
	
	@Override
	public void calcularBonus(){
		this.salario = salario * 0.05;
	}
}