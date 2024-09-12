package Concorrência.Executors.CompletableFuture.ChamadasEncadeadas;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ServiceWithDiscount {
	public String getPriceSync(String storeName){
		double price = priceGenerator();
		Discount.Code dc = Discount.Code.values()[ThreadLocalRandom.current().nextInt(Discount.Code.values().length)];
		return String.format("%s:%.2f:%s", storeName, price, dc);
	}

	public String applyDiscount(Quote q) {
		delay();
		double discountValue = q.getPrice() * (100 - q.getDiscountCode().getPercentage()) / 100;
		return String.format("%sPreço original: %.2f%n. Aplicando código de desconto %s%n. Preço final: %.2f", q.getStore(), q.getPrice(), q.getDiscountCode(), discountValue);
	}
	
	private double priceGenerator() {
		delay();
		return ThreadLocalRandom.current().nextInt(1, 500) *10;
	}
	
	private void delay() {
		try {
			TimeUnit.SECONDS.sleep(1);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}