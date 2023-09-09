package tn.educanet.stockmarket.persistence;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9213151169836324098L;
	
	@Id
    private String id;

	private String Name,Email,Surname;
	private int Age;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String  getId() {
		return id;
	}

	public void setId(String  id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}

	public void setEmail(String Email) {
		// TODO Auto-generated method stub
		this.Email=Email;
	}
	public String getEmail() {
		return Email;
	}

	
	public void setSurname(String Surname) {
		// TODO Auto-generated method stub
		this.Surname=Surname;
	}
	
	public String getSurname() {
		return Surname;
	}

}
