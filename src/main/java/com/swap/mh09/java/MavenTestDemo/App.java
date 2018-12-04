package com.swap.mh09.java.MavenTestDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Employee e1=new Employee(1,"Swapnil");
    	Employee e2=new Employee(2,"Abhi");
    	
        Configuration cfg=new Configuration();
        SessionFactory sessionFactory=cfg.configure().buildSessionFactory();
        Session s1=sessionFactory.openSession();
        
        Transaction transaction=s1.beginTransaction();
        
        s1.save(e1);
        s1.save(e2);
        
        transaction.commit();
        //s1.flush();
        //sessionFactory.close();
        
        
        		
    }
}
