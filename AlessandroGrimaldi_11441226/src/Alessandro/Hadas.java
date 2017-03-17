/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alessandro;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 * Nombre, Altura (menor o igual a 15cm), 
Edad, Salud, y Poder
 * @author adgri_001
 */
public class Hadas implements Serializable {
    protected String nombre;
    protected int altura;
    protected int edad;
    protected float salud;
    protected float poder;
    
    private static final long SerialVersionUID = 777L;
    
    public Hadas() {
    }

    public Hadas(String nombre, int altura, int edad, float salud, float poder) {
        this.nombre = nombre;
        setAltura(altura);
        this.edad = edad;
        this.salud = salud;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if(altura>14){
        this.altura = altura;
        }else{
            JOptionPane.showMessageDialog(null,"La altura tiene que se mayor que 15");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalud() {
        return salud;
    }

    public void setSalud(float salud) {
        this.salud = salud;
    }

    public float getPoder() {
        return poder;
    }

    public void setPoder(float poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
   
        
    }

