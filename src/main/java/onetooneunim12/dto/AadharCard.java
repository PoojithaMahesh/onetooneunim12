package onetooneunim12.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AadharCard {
    @Id
	private int aadharCardId;
	private String name;
	private int age;
	
	public int getAadharCardId() {
		return aadharCardId;
	}
	public void setAadharCardId(int aadharCardId) {
		this.aadharCardId = aadharCardId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "AadharCard [aadharCardId=" + aadharCardId + ", name=" + name + ", age=" + age + "]";
	}
	
}
