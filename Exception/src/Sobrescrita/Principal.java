package Sobrescrita;

import java.io.FileNotFoundException;
import ExceçãoCustomizada.LoginInvalidoException;

public class Principal {

	public static void main(String[] args){
		Pessoa pessoa = new Pessoa();
		Funcionario funcionario = new Funcionario();
		
		try{
			funcionario.salvar();
		}catch(LoginInvalidoException | FileNotFoundException e){
			e.printStackTrace();
		}
	}
}