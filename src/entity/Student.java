/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author martamiszczyk
 */
@Entity
public class Student extends Person
{
    private int matNr;
    private String matDate;
    @Id
     @GeneratedValue
    private Long id;

    public Student()
    {
    }

    public int getMatNr()
    {
        return matNr;
    }

    public void setMatNr(int matNr)
    {
        this.matNr = matNr;
    }

    public String getMatDate()
    {
        return matDate;
    }

    public void setMatDate(String matDate)
    {
        this.matDate = matDate;
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
