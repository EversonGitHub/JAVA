package ClassesAbstratas;

public class Desenvolvedor extends Funcionario {

	public Desenvolvedor(String n, double s) {
		super(n, s);
	}

	@Override
	public String toString() {
		return "Desenvolvedor [Nome= " + nome + ". Salário= " + salario + ".]";
	}
	
	public void calcularBonus(){
		this.salario = salario * 0.1;
	}
}