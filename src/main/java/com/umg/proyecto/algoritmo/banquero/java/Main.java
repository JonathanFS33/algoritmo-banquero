
package com.umg.proyecto.algoritmo.banquero.java;
import com.umg.proyecto.algoritmo.banquero.vista.Ventana;

/**
 *
 * @author Jonathan
 */
public class Main {

    public static void main(String[] args) {
        try {
            Ventana v = new Ventana();
            v.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
