package DesignPatterns.Singleton.LazyInitialization;

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingletonEnum {
	INSTANCE;
	private final Set<String> availableSeats;
	
	AircraftSingletonEnum(){
		this.availableSeats = new HashSet<>();
		this.availableSeats.add("1A");
		this.availableSeats.add("2B");
	}
	
	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);
	}
}