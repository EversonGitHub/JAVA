package Enumeração;

public enum TipoPagamento{
	CREDITO{
		@Override
		public double calcularDesconto(double valor){
			return valor * 0.05;
		}
		
	}, DEBITO{
		public double calcularDesconto(double valor){
			return valor * 0.1;
		}
	};	
	
	public abstract double calcularDesconto(double valor);
}
