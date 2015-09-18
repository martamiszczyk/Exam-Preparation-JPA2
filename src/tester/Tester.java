/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author martamiszczyk
 */
public class Tester
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person p1= new Person();
        p1.setFirstName("Marta");
        p1.setLastName("Miszczyk");
        em.persist(p1);
        
        em.getTransaction().commit();
    }
    
}
