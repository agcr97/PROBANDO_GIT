/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola_git;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Hola_git {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre="";
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        JOptionPane.showMessageDialog(null, "Hola "+nombre+" Bienvenido a Github!!");
    }
    
}
