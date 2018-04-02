package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TripManagerTest {
	
	TripManager tripManager;
	
	@Before
	public void setup(){
		tripManager = new TripManager();
	}
	
	@Test
	public void testAddGetTrips() {
		Trip newTrip = new Trip();
		tripManager.addTrip(newTrip);
		assertEquals(tripManager.getTrips().size(), 1);
		assertEquals(tripManager.getTrips().contains(newTrip), true);
	}
	
	@Test
	public void testRemoveTrip() {
		Trip newTrip1 = new Trip();
		Trip newTrip2=new Trip();
		Trip newTrip3=new Trip();
		tripManager.addTrip(newTrip1);tripManager.addTrip(newTrip2);tripManager.addTrip(newTrip3);
		tripManager.removeTrip(newTrip1);
		assertEquals(tripManager.getTrips().size(), 2);
		
	}
	
	@Test
	public void testFindTrip() {
		Trip tripToCracow = new Trip();
		tripToCracow.setName("Cracow");
		tripManager.addTrip(tripToCracow);
		assertEquals(tripManager.findTrip("Cracow"), tripToCracow);
	}
	
	@Test
	public void testFindTripBasedOnDescription() {
		Trip tripToCracow = new Trip();
		tripToCracow.setDescription("This is amazing trip to Cracow");
		tripToCracow.setName("Krakow");
		tripManager.addTrip(tripToCracow);
		assertEquals(tripManager.findTrip("trip"), tripToCracow);
	}
	
	

}
