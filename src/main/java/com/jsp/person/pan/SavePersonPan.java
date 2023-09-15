package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonPan {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vedant");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Person person = new Person();
		person.setName("ved");
		person.setEmail("ved@mail");
		person.setCno(8104880818l);
		

		Pan pan = new Pan();
		pan.setAddress("NAVI MUMBAI");
		pan.setPerson(person);
		person.setPan(pan);
		
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		
	}

}
