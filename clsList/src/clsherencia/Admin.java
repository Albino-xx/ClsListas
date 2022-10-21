/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clsherencia;

import Sort.SortById;
import Sort.SortByName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jeanr
 */
public class Admin {
    private List<Agenda> agendaList;
     private Productos[] productosList;
    
    public Admin()
    {
        agendaList = new LinkedList<>();
        productosList = new Productos[5];
    }
    
    public void addContact()
    {
        productosList[0] =  new Productos("Banana", 600);
        productosList[1] =  new Productos("Manzana", 200);
        productosList[2] =  new Productos("Sandia", 650);
        productosList[3] =  new Productos("Melon", 750);
        productosList[4] =  new Productos("Uva", 950);
        
        
        agendaList.add(new Cliente("Armando", productosList[1]));
        agendaList.add(new Cliente(2, "Person2", "person2@ulacit.ed.cr", "lastNamePerson2", "774833"));
        
        agendaList.add(new Productos("Ulacit", "info@ulacit.ed.cr", "2332434", "www.ulacit.ed.cr", 145));
        agendaList.add(new Productos("dell","info@dell.com", "44355", "www.dell.com", 6));
        agendaList.add(getContact());
    }
    
    public void deleteItem(final int index)
    {
        agendaList.remove(index);
    }
    
    public void sortById()
    {
        Collections.sort(agendaList, new SortById());
    }
    
    public void sortByName()
    {
        Collections.sort(agendaList, new SortByName() );
    }
    
    private Agenda getContact()
    {
        Agenda contact=null;
        
        var input = JOptionPane.showInputDialog("contact");
        
        switch (input) {
            case "1":
               contact = new Person(1, "Person1", "person1@ulacit.ed.cr", "lastNamePerson1", "7583883");
               break;
            case "2":
                contact = new Company("Ulacit", "info@ulacit.ed.cr", "2332434", "www.ulacit.ed.cr", 1);
                break;
            case "3":
                contact= new Person();
                break;
            default:
                contact = new Company();
                break;
        }
        
        return contact;
    }
    
    public void viewAgenda()
    {
        for(var i : agendaList)
        {
            System.out.println(i.print());
        }
    }
    
    public void viewPerson()
    {
        for(var i : agendaList)
        {
            if(i instanceof Person)
            {
                var person = (Person) i;
                System.out.println(person.getFullName());
                System.out.println(i.print());
            }
        }
    }
}
