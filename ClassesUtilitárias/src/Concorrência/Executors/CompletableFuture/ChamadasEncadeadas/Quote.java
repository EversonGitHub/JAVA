package Concorrência.Executors.CompletableFuture.ChamadasEncadeadas;

public class Quote {
	private final String store;
	private final double price;
	private final Discount.Code discountCode;
	
	private Quote(String s, double p, Discount.Code dc) {
		store = s;
		price = p;
		discountCode = dc;
	}
	
	public static Quote newQuote(String v) {
		String[] values = v.split(":");
		return new Quote(values[0], Double.parseDouble(values[1]), Discount.Code.valueOf(values[2]));
	}
	
	@Override
	public String toString() {
		return "Quote - Store: " + store + "\nPrice: " + price + "\nDiscountCode: " + discountCode + ".";
	}

	public String getStore() {
		return store;
	}

	public double getPrice() {
		return price;
	}

	public Discount.Code getDiscountCode() {
		return discountCode;
	}

	
}	