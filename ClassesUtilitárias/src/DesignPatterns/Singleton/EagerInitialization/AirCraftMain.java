package DesignPatterns.Singleton.EagerInitialization;

public class AirCraftMain {

	public static void main(String[] args) {
		bookSeat("1A");
		bookSeat("2B");
		AirCraftMain.bookSeat("1A");
	}
	
	public static void bookSeat(String seat){
		Aircraft a = new Aircraft("787-100");
		System.out.println(a.bookSeat(seat));
	}
	
	public static void bookSeatAircraftSingletonEager(String seat) {
		System.out.println(AircraftSingletonEager.getInstance());
		AircraftSingletonEager a = AircraftSingletonEager.getInstance();
		System.out.println(a.bookSeat(seat));
	}
}