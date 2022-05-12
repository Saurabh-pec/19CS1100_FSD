package com.pkg19CS1002.jpa_app;
import javax.persistence.*;

public class PersistStudent{
	
	
	public static void main(String args[]) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		//INSERT OPERATION
		
		StudentEntity s1=new StudentEntity();
		s1.setS_id(101);
		s1.setS_name("Gaurav");
		s1.setS_age(24);
		
		StudentEntity s2=new StudentEntity();
		s2.setS_id(102);
		s2.setS_name("Rohit sharma");
		s2.setS_age(22);
		
		StudentEntity s3=new StudentEntity();
		s3.setS_id(103);
		s3.setS_name("Rahul Gandhi");
		s3.setS_age(26);
		
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.getTransaction().commit();
		
		//FETCH/READ OPERATION
		
		StudentEntity s = em.find(StudentEntity.class, 102);		
		System.out.println("Student Name: " + s.getS_name());
		
		//UPDATE OPERATION
		
		/*StudentEntity s = em.find(StudentEntity.class, 103);		
		s.setS_name("Newer Name");
		em.merge(s);
		em.getTransaction().commit();*/
		
		//DELETE OPERATION
		
		/*StudentEntity s = em.find(StudentEntity.class, 103);		
		em.remove(s);
		em.getTransaction().commit();*/
		
		emf.close();
		em.close();
	}
	}
