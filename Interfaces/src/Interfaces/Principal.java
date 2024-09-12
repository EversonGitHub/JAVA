package Interfaces;

public class Principal {

	public static void main(String[] args) {
		DatabaseLoader dbl = new DatabaseLoader();
		FileLoader fl = new FileLoader();
		
		dbl.load();
		fl.load();
		
		dbl.remove();
		fl.remove();
		
		dbl.checarPermissão();
		fl.checarPermissão();
	}
}