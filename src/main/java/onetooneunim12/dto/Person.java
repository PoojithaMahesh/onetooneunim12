package onetooneunim12.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
    @Id
	private int personId;
	private String name;
	private String address;
	@OneToOne
	private AadharCard aadharCard;
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
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
	public AadharCard getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(AadharCard aadharCard) {
		this.aadharCard = aadharCard;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", address=" + address + ", aadharCard=" + aadharCard
				+ "]";
	}
	
}
