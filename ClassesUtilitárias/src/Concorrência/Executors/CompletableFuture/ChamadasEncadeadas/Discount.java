package Concorrência.Executors.CompletableFuture.ChamadasEncadeadas;

public class Discount {
	public enum Code{
		NONE(0), TV(5), SMARTPHONE(10), NOTEBOOK(15);
		private final int percentage;
		
		Code(int p){
			percentage = p;
		}
		
		public int getPercentage() {
			return percentage;
		}
	}
}