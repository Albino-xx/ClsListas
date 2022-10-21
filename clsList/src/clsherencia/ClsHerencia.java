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
public class ClsHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        var admin = new Admin();
        admin.addContact();
        admin.viewAgenda();
        System.out.println("*****");
        admin.sortById();
        admin.viewAgenda();
         System.out.println("*****");
         admin.sortByName();
         admin.viewAgenda();
        //admin.deleteItem(2);
        //admin.viewAgenda();

    }

}
