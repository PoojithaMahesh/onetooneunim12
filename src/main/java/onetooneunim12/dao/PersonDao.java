package onetooneunim12.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetooneunim12.dto.Person;

public class PersonDao {

	public void savePerson(Person person) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
	public void updatePerson(int personId,Person person) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person dbPerson=entityManager.find(Person.class, personId);
		if(dbPerson!=null) {
//			Person is present then i can update the data
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
//			person=name ,address
			person.setPersonId(personId);
//			person=id name address
			person.setAadharCard(dbPerson.getAadharCard());
			entityManager.merge(person);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry person Id is not present");
		}
	}
}
