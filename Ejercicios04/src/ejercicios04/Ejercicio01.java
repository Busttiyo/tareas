package ejercicios04;

/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente.
 */

/**
 *
 * @author david
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vector = new int[100];
        
        for (int i = 0; i<100; i++){
            vector[i] = i+1;
        }
        for (int i = 100 ; i > 0; i--){
            System.out.println(vector[i-1]);
        }
        
    }
    
}
