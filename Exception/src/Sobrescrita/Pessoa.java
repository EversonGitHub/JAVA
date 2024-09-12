package Sobrescrita;

import java.io.IOException;
import ExceçãoCustomizada.LoginInvalidoException;

public class Pessoa {
	public void salvar() throws LoginInvalidoException, IOException{
		System.out.println("Salvando...");
	}
}
