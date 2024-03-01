/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Triangulo {
    
    Scanner leer = new Scanner(System.in);
    
    //Atrubutos
    
    private int base;
    
    private int altura;
    
    //Coantructores

    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Setters and Getters

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //metodos

    @Override
    public String toString() {
        return "Triangulo{" + "leer=" + leer + ", base=" + base + ", altura=" + altura + '}';
    }
    
    //pide los datos para crear el triangulo
    
    public void crearRectangulos(){
        System.out.println("ingrese la base del triangulo");
        setBase(leer.nextInt());
        System.out.println("ingrese la altura del triangulo");
        setAltura(leer.nextInt());
        
    }
    
    //muestra  el area del triangulo (Superficie = base * altura)
    public void area (){
        System.out.println("el area es de: "+(getBase()*getAltura()));
    }
    
    //muestra el perimetro por pantalla((base + altura) * 2)
    public void perimetro(){
        System.out.println("el perimetro es de: "+((base + altura) * 2)); 
    }
    
   
}
