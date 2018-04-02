package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TripTestStuff {
	
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

@Test(expected=Exception.class)
public void testEmptyDescryption() throws Exception {
	testTrip.getDescription();
}

@Test
public void testGetDescription() throws Exception {
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
