package DesignPatterns.Singleton.EagerInitialization;

import java.util.HashSet;
import java.util.Set;

public final class Aircraft {
	private final Set<String> availableSeats = new HashSet<>();
	private final String name;
	
	public Aircraft(String n){
		name = n;
	}
	
	{
		availableSeats.add("1A");
		availableSeats.add("BA");
	}
	
	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);
	}
}