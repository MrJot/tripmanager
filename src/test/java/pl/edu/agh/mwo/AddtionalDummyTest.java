package pl.edu.agh.mwo;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

public class AddtionalDummyTest {
	Trip testTrip;
	
	@Before
	public void setup() {
		testTrip = new Trip();
	}
	
	@Test(expected=NullPointerException.class)
	public void testEmptyDescryption() throws Exception {
		testTrip.setDescription(null);
		testTrip.getDescription();
	}
	
	
}
