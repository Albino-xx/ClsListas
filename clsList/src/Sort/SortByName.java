/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sort;

import clsherencia.Agenda;
import java.util.Comparator;

/**
 *
 * @author ulacit
 */
public class SortByName implements Comparator<Agenda>{

    @Override
    public int compare(Agenda o1, Agenda o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
}
