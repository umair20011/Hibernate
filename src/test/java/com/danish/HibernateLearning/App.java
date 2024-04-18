package com.danish.HibernateLearning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class App{
	public static void main(String[] args) {
		Alien dan=new Alien();
		dan.setAid(101);
		dan.setAname("Danish");
		dan.setColor("Green");
		
		
		Configuration con=new Configuration();
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		session.save(dan);
	}
}
	
