/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clsherencia;

/**
 *
 * @author jeanr
 */
public abstract class Agenda {

    private String name;
    private String email;
    private String phone;
    private int id;

    public Agenda(final String name, final String email, final int id, final String phone) {
        this(id);
        this.email = email;
        this.name = name;
        this.phone=phone;
    }

    public Agenda(final int id) {
        this.id = id;
    }
    
    public Agenda()
    {
        updateData();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setPhone(String phone)
    {
        this.phone=phone;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    protected String print()
    {
        return "id -> " + id + " Name -> " + name + " Phone -> " + phone + " email-> " + email;
    }
    
    public abstract void updateData();

}
