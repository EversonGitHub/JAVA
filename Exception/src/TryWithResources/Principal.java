package TryWithResources;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		lerAquivo();
	}
	
	public static void lerAquivo(){
		try(Leitor leitor = new Leitor(); Leitor2 leitor2 = new Leitor2()){
			
		}catch(IOException e) {
			
		}
	}
}