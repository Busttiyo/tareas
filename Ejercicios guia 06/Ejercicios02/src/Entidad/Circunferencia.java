/*
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Circunferencia {
    
    //Atributos
    
    private double Radio;
    
    //constructors

    public Circunferencia() {
    }

    public Circunferencia(double Radio) {
        this.Radio = Radio;
    }
    
    //Getters and Setters

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
    
    //metodos

    @Override
    public String toString() {
        return "Circunferencia{" + "Radio=" + Radio + '}';
    }
    
    //Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    
    public void crearCircunferencia(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el diametro de la circunferencia");
        setRadio(leer.nextDouble()); 
    }
    
    //Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
    
    public void area(){
        double valor;
        valor= getRadio();
        System.out.println("El Area de la circunferencia es: "+(Math.PI)*(valor*valor));
    }
    
    //Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
    
    public void perimetro(){
        double valor;
        valor= getRadio();
        System.out.println("El perimetro de la circunferencia es: "+2*(Math.PI)*valor);
    }
    
}
