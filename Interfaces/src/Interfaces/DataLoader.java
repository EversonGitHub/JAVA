package Interfaces;

public interface DataLoader {
	public static final int MAX_DATA_SIZE = 10;
	void load();
	
	default void checarPermissão(){
		System.out.println("Checando permissões no DB.");
	}
	
	public static void retrieveMaxDataSize(){
		System.out.println("Método estático dentro da interface. Não pode ser sobrescrito.");
	}
}
