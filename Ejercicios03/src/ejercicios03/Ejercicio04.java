/*
Crea una aplicación que nos pida un número por teclado y con una función se lo 
pasamos por parámetro para que nos indique si es o no un número primo, debe 
devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si 
es primo.

 */
package ejercicios03;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int numero;
        
        System.out.println("ingrese un numero");
        
        numero = leer.nextInt();
        
        mensajes(validacion(numero));
        
    }
    
    //funcion de validacion de N primos
    
    public static boolean validacion(int numero){
        
        boolean v = false;
        
        if (numero%2 == 0){
            v = true;
        }else if (numero%3 == 0){
            v = true;
    }
        return v;
    }
    
    // procedimiento de mensajes
    
    public static void mensajes(boolean vof){
        if (vof == true){
            System.out.println("es un numero primo");
        }else{
            System.out.println("no es numero primo");
        }
        
    }
}
