/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo 
por parámetro. Después haremos otra función o procedimiento que imprima el 
vector.
 */
package ejercicios04;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjercicioExtra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int n;
        
        System.out.println("ingrese el tamaño del vector");
        
        n = leer.nextInt();
        
        int [] v = new int[n];
        
        imrimirVector(rellenarVectores(v));
        
        
    }
    
    //función rellene un vector con números aleatorios
    
    public static int[] rellenarVectores (int [] v){
        
        for(int i = 0; i < v.length; i++){
            v[i]=(int)(Math.random()*10);
        }
        return v;
    }
    
    //procedimiento que imprima el vector
    
    public static void imrimirVector (int [] v){
        for(int i = 0; i < v.length; i++){
            System.out.println("numero "+v[i]);
        }
    }
    
}
