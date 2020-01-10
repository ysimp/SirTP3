package fr.istic.miage.sir.NosqlTP3;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

public class Article {

    @Id
    private ObjectId id;
    private String name;
    private int stars;
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
    
    
    
}
