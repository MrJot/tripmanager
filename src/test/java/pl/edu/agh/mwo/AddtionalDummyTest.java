package pl.edu.agh.mwo;

import org.junit.Before;
import org.junit.Test;

public class AddtionalDummyTest {
	Trip testTrip;
	
	@Before
	public void setup() {
		testTrip = new Trip();
	}
	
	@Test(expected=Exception.class)
	public void testEmptyDescryption() throws Exception {
		testTrip.getDescription();
	}
	
	
}
