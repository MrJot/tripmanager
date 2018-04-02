package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PhotoTestClass {
	
	Photo photo;
	
	@Before
	public void setUp() {
		photo=new Photo();
	}
	

	@Test
	public void testGetComment() {
		photo.setComment("This is a very nice shot !");
		assertEquals(photo.getComment(),"This is a very nice shot !" );
	}
	

	

}
