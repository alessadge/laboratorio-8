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
public class Salamandras extends Hadas {
     private int alas;

    public Salamandras() {
        super();
    }

    public Salamandras(int alas, String nombre, int altura, int edad, float salud, float poder) {
        super(nombre, altura, edad, salud, poder);
        this.alas = alas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        if(alas>=16){
        this.alas = alas;
        }else{
            JOptionPane.showMessageDialog(null, "Tienen que tener mas de 16 alas");
        }
    }

    @Override
    public void atacar() {
    }
}
