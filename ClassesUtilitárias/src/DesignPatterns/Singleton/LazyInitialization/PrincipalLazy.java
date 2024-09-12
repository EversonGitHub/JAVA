package DesignPatterns.Singleton.LazyInitialization;

import DesignPatterns.Singleton.EagerInitialization.Aircraft;
import DesignPatterns.Singleton.EagerInitialization.AircraftSingletonEager;

public class PrincipalLazy {

	public static void main(String[] args) {
		bookSeat("1A");
		bookSeat("2B");
	}
	
	public static void bookSeat(String seat) {
		Aircraft a = new Aircraft("787-100");
		System.out.println(a.bookSeat(seat));
	}
	
	public static void bookSeat2(String seat) {
		System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
		AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
		System.out.println(instance.bookSeat(seat));
	}
	
	public static void bookSeatAircraftSingletonEager(String seat) {
		System.out.println(AircraftSingletonEager.getInstance());
		AircraftSingletonLazy a = AircraftSingletonLazy.getInstance();
		System.out.println(a.bookSeat(seat));
	}
}