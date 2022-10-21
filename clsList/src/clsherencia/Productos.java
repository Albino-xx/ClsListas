/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clsherencia;

import javax.swing.JOptionPane;

/**
 *
 * @author jeanr
 */
public final class Productos extends Agenda{
    
    private String nombre;
     private int precio;
    
    public Productos()
    {
        super();
    }
    
    public Productos(final int id)
    {
        super(id);
    }
    
    public Productos(final String nombre, final int precio)
    {
        this.nombre=nombre;
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    @Override
    protected String print()
    {
       return super.print() + " web -> " + nombre;
    }
    
    @Override
    public void updateData()
    {
        nombre = JOptionPane.showInputDialog("Web");
        super.setName(JOptionPane.showInputDialog("Name"));
        super.setPhone(JOptionPane.showInputDialog("phone"));
        super.setEmail(JOptionPane.showInputDialog("Email"));
    }
   
}
