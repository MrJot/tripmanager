package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TripTest {
	
Trip testTrip;
	
@Before
public void setup() {
	testTrip = new Trip();
}

@Test
public void testGetTripName() {
	testTrip.setName("Cracow");
	assertEquals(testTrip.getName(),"Cracow");
}


@Test
public void testGetDescription() {
	testTrip.setDescription("Beautiful place to visit");
	assertEquals(testTrip.getDescription(),"Beautiful place to visit");
}


@Test
public void testgetPhotos() {
	Photo samplePhoto =  new Photo();
	testTrip.addPhoto(samplePhoto);
	assertEquals(testTrip.getPhotos().size(), 1);
	assertEquals(testTrip.getPhotos().contains(samplePhoto), true);
}

}
