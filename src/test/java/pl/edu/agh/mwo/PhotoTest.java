package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PhotoTest {
	
	@Test
	public void testPhotoComment() {
		Photo photo = new Photo();
		photo.setComment("Nice photo!");
		assertEquals(photo.getComment(), "Nice photo!");
	}
	

	


	

	

}
