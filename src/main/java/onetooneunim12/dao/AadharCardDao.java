package onetooneunim12.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetooneunim12.dto.AadharCard;
import onetooneunim12.dto.Person;

public class AadharCardDao {

	public void saveAadharCard(int personId,AadharCard aadharCard) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person dbPerson=entityManager.find(Person.class, personId);
		if(dbPerson!=null) {
//			he is a valid person then i can give an aadharcard to him
//			and also i can update person details also
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(aadharCard);
			dbPerson.setAadharCard(aadharCard);
			entityManager.merge(dbPerson);
			
			entityTransaction.commit();
			
			
		}else {
//			person id is not present and that person is not valid person
			System.out.println("Sorry invalid person ID");
		}
	}
	
}
