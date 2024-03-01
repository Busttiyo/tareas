/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Operacion {
    
    
    Scanner leer = new Scanner(System.in);
    
    //Atrinutos
    
    private int numero1;
    
    private int numero2;
    
    //Constructores

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //Setters and Getters
    
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    //Metodos
    
    //Método para crearOperacion(): que le pide al usuario los dos números y los guarda
    //en los atributos del objeto.
    
    public void crearOperacion(){
        System.out.println("ingrese el primer numero");
        setNumero1(leer.nextInt());
        System.out.println("ingrese el segundo numero");
        setNumero2(leer.nextInt());
    }
    
    //Método sumar(): calcular la suma de los números y devolver el resultado al main.
    
    public int sumar(){
        int suma = getNumero1() + getNumero2();     
        return suma;
    }
    
    //Método restar(): calcular la resta de los números y devolver el resultado al main
    
    public int resta(){
        int resta = getNumero1() - getNumero2();
        return resta;
    }
    
    //g)Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
    //fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
    //Si no, se hace la multiplicación y se devuelve el resultado al main
    
    public int multiplicar(){
        
        int num= 0;
       
        if(getNumero1() != 0 || getNumero2() != 0){
            num = getNumero1() * getNumero2();
        }
        else{
            System.out.println("uno de los balores es 0 y por ende su multiplicacion es futil");
            
        }
        
        
        return num;
    }
    
    public int dividir(){
        int num= 0;
       
        if(getNumero2() != 0){
            num = getNumero1() / getNumero2();
        }
        else{
            System.out.println("e valor numero 2 es 0 y por ende su division es imposible");
            
        }
       
        return num;
    }
    
    //h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
    //una división por cero, el método devuelve 0 y se le informa al usuario el error se le
    //informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
    
    
    
}
