/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de 
tamaño N, con los valores ingresados por el usuario.
 */
package ejercicios04;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjercicioExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        mensaje(suma(vector()));
    }
    
    // crea un vector de tamalo modular y devuelve un vector lleno
    
    public static int[] vector(){
        
        Scanner leer = new Scanner(System.in);
        
        int tamaño;
        
        System.out.println(" ingresa el tamaño del vector");
        
        tamaño = leer.nextInt();
        
        int [] vector= new int[tamaño];
            
            for (int i = 0; i < tamaño; i++){
                System.out.println("ingrese numero par el vector");
                vector[i] = leer.nextInt();
            }
            
        return vector;
    }
    
    // suma todos los valores dentor de un vector y lo devuelve
    
    public static int suma(int [] v){
        
        int resultado = 0;
        
        for(int i = 0; i < v.length; i++){
            resultado = resultado + v[i];
        }

        return resultado;
    }
    
    //procedimiento para mostrar un mensaje
    
    public static void mensaje(int m){
        
        System.out.println("la suma de todos los valores dentro de el vector es: "+m);
    }
    
}
