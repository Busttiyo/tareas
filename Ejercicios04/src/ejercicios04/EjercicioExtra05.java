/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y 
muestre la suma de sus elementos.
 */
package ejercicios04;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjercicioExtra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sumador(matrix());
        
    }
    
    //crea y devuelve una matris de tamaño dinamico.
 
    public static int [][] matrix(){
        
        Scanner leer = new Scanner(System.in);
        
        int n, m;
        
        System.out.println("ingrese el ancho de la matris");
        
        n = leer.nextInt();
        
        System.out.println("ingrese el largo de la matrix");
        
        m = leer.nextInt();
        
        int [][] matrix = new int[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = (int) (Math.random()*11);
            }
        }
        return matrix;
    }

    //procvedimiento toma una matris y devuelve la suma de todos los valores
    
    public static void Sumador(int [][] m){
        
        int contador = 0;
        for(int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                contador += m[i][j];
            }
        }
        
        mostrarMatris(m);
        
        System.out.println("la suma de toda de todos los valores de la matrix es: "+contador);
        
    }
    
    //procedimiento que muestra una matrix por pantalla y no devuelve nada
            
    public static void mostrarMatris(int [][] m){
        for(int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j]+".");
            }
            System.out.println("");
        }
    }
    
    
}
