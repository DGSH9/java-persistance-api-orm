package com.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	//POST DATA
    	Laptop l2  =new Laptop();
    	l2.setId(101);
    	l2.setBrand("HP");
    	l2.setPrice(999999);
    	
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	em.persist(l2);
    	em.getTransaction().commit();
    	System.out.println(l2);
    	
    	
    	//GET DATA
		/*
		 * Laptop l1 = em.find(Laptop.class,16); System.out.println(l1);
		 */
        	
    }
}
