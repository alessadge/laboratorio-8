/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alessandro;

import javax.swing.JOptionPane;

/**
 *
 * @author adgri_001
 */
public class Silfides extends Hadas {
    private int alas;

    public Silfides() {
        super();
    }

    public Silfides(int alas, String nombre, int altura, int edad, float salud, float poder) {
        super(nombre, altura, edad, salud, poder);
        this.alas = alas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        if(alas>=6){
        this.alas = alas;
        }else{
            JOptionPane.showMessageDialog(null, "Tienen que tener mas de 6 alas");
        }
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    @Override
    public void atacar() {
    }
    
}
