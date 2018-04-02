package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class TripManager {
	
	
	
	private Collection<Trip> trips = new ArrayList<Trip>();
	
	public Collection<Trip> getTrips() {
		return trips;
	}

	public void addTrip(Trip trip) {
		trips.add(trip);
	}

	public void removeTrip(Trip trip) {
		if(this.trips.isEmpty()) {
			System.out.println("Trip list is empty.");
		}else {
			this.trips.remove(trip);	
		}
		
		
	}

	


}
