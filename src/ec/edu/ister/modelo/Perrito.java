/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Perrito extends Animal{
    public Perrito(){
        //super invoca os constructores de la clase padre
        //super("mateo");
        JOptionPane.showMessageDialog(null, "constructor por defecto perrito");
    }
    
}
