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
public class Lamias extends Hadas {
    
    private int aleta;
    private int branquias;

    public Lamias() {
        super();
        
    }

    public Lamias(int aleta, int branquias, String nombre, int altura, int edad, float salud, float poder) {
        super(nombre, altura, edad, salud, poder);
        this.aleta = aleta;
        this.branquias = branquias;
    }

    public int getAleta() {
        return aleta;
    }

    public void setAleta(int aleta) {
        if(aleta<=5){
        this.aleta = aleta;
        }else{
            JOptionPane.showMessageDialog(null, "La aleta tiene que ser menor o igual que 5");
        }

    }

    public int getBranquias() {
        return branquias;
    }

    public void setBranquias(int branquias) {
        if (branquias<=8) {
          this.branquias = branquias ; 
        } else {
            JOptionPane.showMessageDialog(null, "Solo pueden haber 8 branquias");
        }
        ;
    }


    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
