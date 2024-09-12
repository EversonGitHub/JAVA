package Enumeração;

public class Principal {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Marcos", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
		Cliente c2 = new Cliente("Ana", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
		Cliente c3 = new Cliente("Ramon", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
		Cliente c4 = new Cliente("Clara", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		System.out.println("Total de desconto: " + TipoPagamento.CREDITO.calcularDesconto(150));
		System.out.println("Total de desconto: " + TipoPagamento.DEBITO.calcularDesconto(200));
		
		TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
		System.out.println(tipoCliente.getNomeRelatorio());
		
		TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa física");	
		System.out.println(tipoCliente2);
	}
}