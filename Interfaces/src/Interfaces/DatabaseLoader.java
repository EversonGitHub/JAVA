package Interfaces;

public class DatabaseLoader implements DataLoader, DataRemover{
	@Override
	public void load(){
		System.out.println("Carregando dados do DB.");
	}
	
	@Override
	public void remove(){
		System.out.println("Removendo dados do DB.");
	}
	
	@Override
	public void checarPermissão(){
		System.out.println("Checando permissão no DB.");
	}
}
