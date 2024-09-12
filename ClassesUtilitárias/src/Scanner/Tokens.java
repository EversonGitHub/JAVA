package Scanner;

import java.util.Scanner;

public class Tokens {

	public static void main(String[] args) {
		String texto = "Messi,Xavi,Iniesta,true,10";
		Scanner teclado = new Scanner(texto);
		
		teclado.useDelimiter(",");
		while(teclado.hasNext()){
			if(teclado.hasNextInt()){
				int i = teclado.nextInt();
				System.out.println("Int: " + i);
			}else if(teclado.hasNextBoolean()){
				boolean b = teclado.nextBoolean();
				System.out.println("Boolean: " + b);
			}else{
				System.out.println(teclado.next());
			}
		}
		teclado.close();
	}
}