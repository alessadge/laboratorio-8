/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alessandro;

/**
 *
 * @author adgri_001
 */
public class Hemadriades extends Hadas{
    private float saludArbol;

    public Hemadriades() {
        super();
    }

    public Hemadriades(float saludArbol, String nombre, int altura, int edad, float salud, float poder) {
        super(nombre, altura, edad, salud+saludArbol, poder);

    }

    public float getSaludArbol() {
        return saludArbol;
    }

    public void setSaludArbol(float saludArbol) {
        this.saludArbol = saludArbol;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
}
