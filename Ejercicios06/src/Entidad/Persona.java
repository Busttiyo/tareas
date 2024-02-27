/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author david
 */
public class Persona {
    
    //Atributos
    public String Nombre;
    
    public int Edad;
    
    public int DNI;
    
    //CONSTRUCTORES

    public Persona() {
    }

    public Persona(String Nombre, int Edad, int DNI) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.DNI = DNI;
    }
    
    // GETTERS AND SETTERS

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", DNI=" + DNI + '}';
    }
    
    
    
}
