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

	public String getDescription() throws Exception {
		if(this.description.isEmpty()) {
			throw new Exception();
		}
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



	private String description;
	
	
	private Collection<Photo> photos = new ArrayList<Photo>();
	
	public Collection<Photo> getPhotos() {
		return photos;
	}

	public void addPhoto(Photo photo) {
		photos.add(photo);
	}



}
