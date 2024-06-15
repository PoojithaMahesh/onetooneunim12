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
	
	
	
	
	
	
	
	
	
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setAadharCardId(103);
//	aadharCard.setName("FAHAR");
//	aadharCard.setAge(20);
//	
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.saveAadharCard(3, aadharCard);
	
	
//	UPDATE THE AADharcard
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setName("FAHarAbc");
//	aadharCard.setAge(21);
//	
//	AadharCardDao cardDao=new AadharCardDao();
//	cardDao.updateAadharCard(103, aadharCard);
	
	
//	Update the Person
	
//	Person person=new Person();
//	person.setName("pooji");
//	person.setAddress("Mysorwe");
//	
//	
//	
//	
//	
//	PersonDao personDao=new PersonDao();
//	personDao.updatePerson(1, person);
	
	
//	Find 
//	PersonDao personDao=new PersonDao();
//	personDao.findPerson(1);
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.findAadharCard(101);
	
//	Delete
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.deleteAadharCard(103);
//	
	
	PersonDao personDao=new PersonDao();
	personDao.deletePerson(1);
	
}
}
