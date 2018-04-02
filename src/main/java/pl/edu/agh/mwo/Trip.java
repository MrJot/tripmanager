package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class Trip {
	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPhotos(Collection<Photo> photos) {
		this.photos = photos;
	}

	private String description;
	
	
	private Collection<Photo> photos = new ArrayList<Photo>();
	
	public Collection<Photo> getPhotos() {
		return photos;
	}

	public void addPhoto(Photo photo) {
		photos.add(photo);
	}

	public void addTrip(Trip trip) {
		// TODO Auto-generated method stub
		
	}

}
