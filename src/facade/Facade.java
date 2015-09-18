/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Employee;
import entity.Person;
import entity.Student;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author martamiszczyk
 */
public class Facade
{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
   

    public Facade(EntityManagerFactory emf)
    {
        this.emf=emf;
    }
    
    public void addStudent(Student s)
    {
         EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.persist(s);
            em.getTransaction().commit();
        } finally
        {
            em.close();
        }
    }
     public void addEmployee(Employee e)
    {
         EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.persist(e);
            em.getTransaction().commit();
        } finally
        {
            em.close();
        }
    }
      public void addPerson(Person p)
    {
         EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } finally
        {
            em.close();
        }
    }
       public Student findStudent(Student s)
    {
         EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            Student s1 = (Student) em.createQuery("SELECT s from Student s where s.matNr= :matNr").setParameter("matNr", "123").getSingleResult();   
            em.getTransaction().commit();
            return s1;
        } finally
        {
            em.close();
        }
    }
     public Employee findEmployee(Employee e)
    {
         EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            Employee e1 = (Employee) em.createQuery("SELECT e from Employee e where e.soSecNr= :soSecNr").setParameter("soSecNr", "1234").getSingleResult();   
            em.getTransaction().commit();
            return e1;
        } finally
        {
            em.close();
        }
    }
      public Person findPerson(Person p)
    {
         EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            Person p1 = (Person) em.createQuery("SELECT p from Person p where p.firstName= :firstName").setParameter("firstName", "Marta").getSingleResult();   
            em.getTransaction().commit();
            return p1;
        } finally
        {
            em.close();
        }
    }
      public void editPerson(Person p)
    {
         EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        } finally
        {
            em.close();
        }
    }
      public void editStudent(Student s)
    {
         EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.merge(s);
            em.getTransaction().commit();
        } finally
        {
            em.close();
        }
    }
     public void editEmployee(Employee e)
    {
         EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.merge(e);
            em.getTransaction().commit();
        } finally
        {
            em.close();
        }
    }
      public void deleteStudent(Student s)
    {
         EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.remove(s);
            em.getTransaction().commit();
        } finally
        {
            em.close();
        }
    }
     public void deleteEmployee(Employee e)
    {
         EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.remove(e);
            em.getTransaction().commit();
        } finally
        {
            em.close();
        }
    }
      public void deletePerson(Person p)
    {
         EntityManager em = emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        } finally
        {
            em.close();
        }
    }
    
}
