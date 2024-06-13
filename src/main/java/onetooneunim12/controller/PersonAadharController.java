package onetooneunim12.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetooneunim12.dao.AadharCardDao;
import onetooneunim12.dao.PersonDao;
import onetooneunim12.dto.AadharCard;
import onetooneunim12.dto.Person;

public class PersonAadharController {
public static void main(String[] args) {
	
	
//	Person person=new Person();
//	person.setPersonId(3);
//    person.setName("Fahar");
//    person.setAddress("Mysore");
//   
//
//	
//	PersonDao personDao=new PersonDao();
//	personDao.savePerson(person);
	
	
	
	AadharCard aadharCard=new AadharCard();
	aadharCard.setAadharCardId(103);
	aadharCard.setName("FAHAR");
	aadharCard.setAge(20);
	
	AadharCardDao aadharCardDao=new AadharCardDao();
	aadharCardDao.saveAadharCard(3, aadharCard);
	
	
	
	
	
	
	
	
	
}
}
