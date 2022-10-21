/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clsherencia;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jeanr
 */
public final class Cliente extends Agenda{
    
    private String nombre;
     private List<Productos> productosList;
    
    public Cliente()
    {
        super();
    }
    
    public Cliente(final int id, final String nombre)
    {
        super(id);
        this.nombre=nombre;
    }
    
    public Cliente(final String nombre, final List productosList)
    {
        this.nombre=nombre;
         this.productosList=productosList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public void setProductosList(List productosList) {
        this.productosList = productosList;
    }
    
     public List getProductosList() {
        return productosList;
    }
    
    @Override
    public String print()
    {
        return "Id =>  " + super.getId() + " Name => " + super.getName() + " " + nombre + " Phone => " + super.getPhone() + " Email => " + super.getEmail();
    }
    
    @Override
    public void updateData()
    {
        nombre = JOptionPane.showInputDialog("last Name");
        super.setEmail(JOptionPane.showInputDialog("Email"));
        super.setName(JOptionPane.showInputDialog("Name"));
        super.setPhone(JOptionPane.showInputDialog("Phone"));
    }
    
    public String getFullName()
    {
        return super.getName() + " " + nombre;
    }
    
}
