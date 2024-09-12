package DesignPatterns.Factory;

public class PrincipalFactory {

	public static void main(String[] args) {
		Currency c = CurrencyFactory.newCurrency(Country.BRAZIL); 
		System.out.println(c.getSymbol());
	}
}