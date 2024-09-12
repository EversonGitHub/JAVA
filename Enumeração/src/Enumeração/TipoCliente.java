package Enumeração;

public enum TipoCliente {
	PESSOA_FISICA(1, "Pessoa física"), PESSOA_JURIDICA(2, "Pessoa jurídica");
	private final int VALOR;
	private String nomeRelatorio;
	
	TipoCliente(int v, String nr){
		VALOR = v;
		nomeRelatorio = nr;
	}
	
	public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
		for(TipoCliente tipoCliente: values()){
			if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
				return tipoCliente;
			}
		}
		return null;
	}

	public String getNomeRelatorio(){
		return nomeRelatorio;
	}

	public int getVALOR(){
		return VALOR;
	}
}