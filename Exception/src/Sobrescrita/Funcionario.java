package Sobrescrita;

import java.io.FileNotFoundException;
import ExceçãoCustomizada.LoginInvalidoException;

public class Funcionario extends Pessoa {
	public void salvar() throws LoginInvalidoException, FileNotFoundException{
		System.out.println("Salvando funcionário.");
		
	}
}
