/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido
 */
package ejercicios04;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        buscador(Vector(),chequeo(Vector()));
         
    }
    
    // funcion de cracion de vectores y devuelve un vector
    
    public static int[] Vector() {
        
        Scanner leer = new Scanner(System.in);
        
        int num, num2;
        
        System.out.println("ingrese el tamaño del vector");
        
        num = leer.nextInt();
        
        int[] vector = new int[num]; 
        
        for(int i = 0; i < num; i++){
            vector[i] = (int) (Math.random()*100);
        }
        
        return vector;
    }
    
    //funcion que compruebe que el vector tinene un numero en concreto y devuelve el numero

    public static int chequeo(int[] vector){
        
        Scanner leer = new Scanner(System.in);
        
        int num, chequeo = 0;
        
        System.out.println("ingrese el numero a buscar");
        
        num = leer.nextInt();
        
        for (int i = 0; i < vector.length; i++){
            if (vector[i] == num){
                chequeo = vector[i];
                System.out.println("numero encontrado");
                break;
            }
        }
        return chequeo;
    }
    
    //funcion de chequeo de que se encuentra el numero enla funcion
    
    public static void buscador( int[] vector, int num){
         
        for (int  i = 0; i < vector.length ; i++){
            if(num != 0 && vector[i] == num){
                System.out.println("numero "+num+" esta en la pocicion "+i+" del vector");
            }
        }
        
    } 
}
