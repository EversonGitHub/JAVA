package Concorrência.Executors.CompletableFuture.ChamadasEncadeadas;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		ServiceWithDiscount s = new ServiceWithDiscount();
		searchPricesWithDiscount(s);
	}
	
	private static void searchPricesWithDiscount(ServiceWithDiscount service) {
		List<String> stores = List.of("Service1", "Service2", "Service3", "Service4");
		stores.forEach(s -> System.out.println(service.getPriceSync(s)));
	}
}