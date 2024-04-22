package com.danish.HibernateLearning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Entity;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		AlienName an=new AlienName();
		an.setFname("Danish");
		an.setLname("Maniyar");
		an.setMname("Shadulla");
		Alien dan=new Alien();
		dan.setAid(101);
		dan.setColor("Green");
		dan.setAname(an);
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
		
		
		
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		//dan=(Alien)session.get(Alien.class,102);
		session.save(dan);
		tx.commit();
		System.out.println(dan);
	}
}
	
