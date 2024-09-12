package DesignPatterns.Singleton.LazyInitialization;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLazy {
	private static AircraftSingletonLazy INSTANCE;
	private final Set<String> availableSeats = new HashSet<>();
	private final String name;
	
	private AircraftSingletonLazy(String n) {
		name = n;
	}
	
	{
		availableSeats.add("1A");
		availableSeats.add("BA");
	}
	
	public static AircraftSingletonLazy getInstance() {
		if(INSTANCE == null) {
			synchronized (AircraftSingletonLazy.class) {
			}
			INSTANCE = new AircraftSingletonLazy("787-900");
		}
		return INSTANCE;
	}

	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);
	}
}
