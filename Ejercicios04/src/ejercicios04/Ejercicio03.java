/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package ejercicios04;

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
        
        Dividir(creadorDeVectores());
        
    }
    
    //funcion que cree un vector y lo devuelve;
    
    public static int[] creadorDeVectores(){
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        System.out.println("ingrese el tamaño del vector");
        
        num = leer.nextInt();
        
        int [] vector = new int[num];
        
        for (int i = 0; i < num; i++){
            vector[i] = (int) (Math.random()*10000);
        }
        return vector;
    }
    
    // funcion que divide los numeros por digitos
    
    public static void Dividir(int[] vec){
        
        
        
    }
    
}
