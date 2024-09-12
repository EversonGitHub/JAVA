package Enumeração;

public class Cliente {
	private String nome;
	private TipoCliente tipoCliente;
	private TipoPagamento tipoPagamento;

	public Cliente(String n, TipoCliente tc, TipoPagamento tp){
		nome = n;
		tipoCliente = tc;
		tipoPagamento = tp;
	}
	
	@Override
	public String toString() {
		return "Cliente [Nome= " + nome + ". Tipo do Cliente int= " + tipoCliente.getVALOR() + ". Tipo do Cliente= " + tipoCliente.getNomeRelatorio() + ". Tipo de pagamento=" + tipoPagamento + ".]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
}