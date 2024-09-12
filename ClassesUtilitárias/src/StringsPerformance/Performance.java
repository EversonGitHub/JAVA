package StringsPerformance;

public class Performance {

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		concatString(15000);
		long fim = System.currentTimeMillis();
		System.out.println("Tempo gasto pra string: " + (fim - inicio) + " ms.");
		
		inicio = System.currentTimeMillis();
		concatStringBuilder(50000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto pra string builder: " + (fim - inicio) + " ms.");
		
		inicio = System.currentTimeMillis();
		concatStringBuffer(60000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto pra string buffer: " + (fim - inicio) + " ms.");
	}
	
	private static void concatString(int tamanho){
		String texto = " ";
		for(int i=0; i < tamanho; i++){
			texto += i;
		}
	}
	
	private static void concatStringBuilder(int tamanho){
		StringBuilder sb = new StringBuilder(tamanho);
		for(int i=0; i < tamanho; i++){
			sb.append(i);
		}
	}
	
	private static void concatStringBuffer(int tamanho){
		StringBuffer sb = new StringBuffer(tamanho);
		for(int i=0; i < tamanho; i++){
			sb.append(i);
		}
	}
}