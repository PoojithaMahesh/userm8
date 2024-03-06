package userm8;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
	private int id;
	private String name;
	private String address;
	
//	getter and setter 
//	tooString
//	how to get getter and setter= Alt+S generate getter and setter select all generate
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
  
	
}
