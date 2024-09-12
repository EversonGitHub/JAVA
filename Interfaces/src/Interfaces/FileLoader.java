package Interfaces;

public class FileLoader implements DataLoader, DataRemover{
	@Override
	public void load(){
		System.out.println("Carregando dados de um arquivo.");
	}
	
	@Override
	public void remove(){
		System.out.println("Deletando dados de um arquivo.");
	}
	
	@Override
	public void checarPermissão(){
		System.out.println("Checando permissão no DB.");
	}
}
