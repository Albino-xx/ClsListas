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
public class SortByIdName implements Comparator<Agenda> {

    @Override
    public int compare(Agenda o1, Agenda o2) {
        if (o1.getId() > o2.getId()) {
            return 1;
        } else if (o1.getId() < o2.getId()) {
            return -1;
        } else {
            if (o1.getName().compareTo(o2.getName()) == 0) {
                return o1.getEmail().compareTo(o2.getEmail());
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        }
    }

}
