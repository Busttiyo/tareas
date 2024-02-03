/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear 
un programa que permita introducir un cuadrado por teclado y determine si este 
cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package ejercicios04;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mostrarMensaje(cuboMagico(crearMatrix()));
    }
    
    // crea una matris y la devuelve llena de valores
    
    public static int [][] crearMatrix(){
        
        Scanner leer = new Scanner(System.in);
        
        int [][] matrix = new int [3][3];
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3;j++){
                matrix[i][j] = leer.nextInt();
            }
        }
        return matrix;  
    }
    
    // comprueva si es cubo magico y devuelve true o false en funcion de eso;
    
    public static boolean cuboMagico(int [][] matrix){
        
        boolean f1 = false,f2 = false, f3 = false;
        
        boolean c1 = false, c2 = false, c3 = false;
        
        boolean d1 = false, d2 = false;
        
        boolean confirmar = false;
        
            //filas
            if (matrix[0][0]+matrix[0][1]+matrix[0][2] == 15){
                f1 = true;
            }
            if (matrix[1][0]+matrix[1][1]+matrix[1][2] == 15){
                f2 = true;
            }
            if (matrix[2][0]+matrix[2][1]+matrix[2][2] == 15){
                f3 = true;
            }
            
            //colucnas
            if (matrix[0][0]+matrix[1][0]+matrix[2][0] == 15){
                c1 = true;
            }
            if (matrix[0][1]+matrix[1][1]+matrix[2][1] == 15){
                c2 = true;
            }
            if (matrix[0][2]+matrix[1][2]+matrix[2][2] == 15){
                c3 = true;
            }
            
            //diagonales
            if (matrix[0][0]+matrix[1][1]+matrix[2][2] == 15){
                d1 = true;
            }
            if (matrix[0][2]+matrix[1][1]+matrix[2][0] == 15){
                d2 = true;
            }
            
            // confirmacion
            
            if(f1 == true && f2 == true && f3 == true && c1 == true && c2 == true && c3 == true && d1 == true && d2 == true){
                confirmar = true;
            }
            
        return confirmar;
    }
    
    public static void mostrarMensaje(boolean m){
        if(m == true){
            System.out.println("la matris es cubo magico");
        }else{
            System.out.println("la matris no es cubo magico");
        }
    }
}
