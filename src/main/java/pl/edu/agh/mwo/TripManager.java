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
			this.trips.remove(trip);
	}

	public Trip findTrip(String keyword) {
		
		Trip match = null;
		
		for (Trip trip:this.trips) {
			if(trip.getName().equals(keyword)||trip.getDescription().contains(keyword)) {
				match = trip;
			}else {
				match=null;
			}
		}
		return match;
	}
	


}
