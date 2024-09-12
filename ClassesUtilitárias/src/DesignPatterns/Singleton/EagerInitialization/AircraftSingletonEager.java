package DesignPatterns.Singleton.EagerInitialization;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {
	private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
	private final Set<String> availableSeats = new HashSet<>();
	private final String name;
	
	private AircraftSingletonEager(String n) {
		name = n;
	}
	
	{
		availableSeats.add("1A");
		availableSeats.add("BA");
	}
	
	public static AircraftSingletonEager getInstance() {
		return INSTANCE;
	}

	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);
	}
}
