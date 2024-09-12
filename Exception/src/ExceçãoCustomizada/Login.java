package ExceçãoCustomizada;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		try{
			logar();
		}catch(LoginInvalidoException e){
			e.printStackTrace();
		}
	}
	
	private static void logar() throws LoginInvalidoException{
		Scanner teclado = new Scanner(System.in);
		String usernameDB = "Everson.";
		String senhaDB = "as23#Dasfhh3";
		System.out.println("Usuário: ");
		String userNameDigitado = teclado.nextLine();
		String senhaDigitada = teclado.nextLine();
		teclado.close();
		
		if(!usernameDB.equals(userNameDigitado) || !senhaDB.equals(senhaDigitada)){
			throw new LoginInvalidoException("Usuário ou senha inválidos.");
		}
		
		System.out.println("Usuário logado com sucesso.");
	}
}