/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author martamiszczyk
 */

@Entity
public class PhdStudent extends Employee
{
    private String dissSubject;
    @Id
     @GeneratedValue
    private Long id;

    public PhdStudent()
    {
    }

    public String getDissSubject()
    {
        return dissSubject;
    }

    public void setDissSubject(String dissSubject)
    {
        this.dissSubject = dissSubject;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }
}
