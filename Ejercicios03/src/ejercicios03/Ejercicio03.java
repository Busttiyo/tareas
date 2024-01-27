/*
Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
convertir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void).


El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 dolares es un 1 €
* 129.852 yenes es un 1 €

 */
package ejercicios03;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       datos();
    }
    
    // procedimiento de convercion
    
    public static void comvertir(int cantidad, String divisa){
        
        if (divisa.equals("libra")){
            System.out.println(cantidad+" de libras se combertira a "+(cantidad*0.86));
        }else if(divisa.equals("dolares")){
            System.out.println(cantidad+" de dolares se combertira a "+(cantidad*1.28611));
        }else if(divisa.equals("yenes")){
            System.out.println(cantidad+" de yenes se combertira a "+(cantidad*1.28611));
        }else{
            System.out.println("valor no admitido");
        }
        
        
        
    }
    
    //procedimiento de datos 
    
    public static void datos(){
        
        Scanner leer = new Scanner(System.in);
        
        int cantidad;
        
        String divisa;
        
        System.out.println("ingrese el monto a cambiar");
        
        cantidad = leer.nextInt();
        
        System.out.println("ingrese la divisa a cambiar");
        
        divisa = leer.next();
        
        comvertir(cantidad,divisa);       
    }
    
    
}
