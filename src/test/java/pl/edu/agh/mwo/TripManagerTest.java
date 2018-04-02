package pl.edu.agh.mwo;

import org.junit.Before;
import org.junit.Test;

public class TripManagerTest {
	
	@Before
	public void testAddTrip(){
		Trip testTrip = new Trip();
	}
	
	@Test
	public void addTripTest(Trip trip) {
		trip.addTrip(testTrip);
	}
	
	

}
