package fr.istic.miage.sir.NosqlTP3;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

public class Person {

    @Id
    private ObjectId id;
    private String name;
    
    private List<Address> address;
    
    
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
	public List<Address> getAdress() {
		return address;
	}
	public void setAddress(Address adress) {
		this.address.add(adress) ;
	}
    
    
}
