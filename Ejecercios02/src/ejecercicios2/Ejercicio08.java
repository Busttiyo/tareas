/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por 
ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

 */
package ejecercicios2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int medida;
        
        System.out.println("ingrese la medida del cubo");
        
        medida = leer.nextInt();
        
        System.out.println("================");
        System.out.println("");
        for (int i = 0; i < medida; i++){
            System.out.println("");
            for (int j = 0; j < medida; j++){
                if (i == 0 || i == medida - 1){
                    System.out.print("*");
                }else if (j == 0 || j == medida-1 ){
                    System.out.print("*");
                }else if ( j > 0 || j < medida -1){
                    System.out.print(" ");
                }
                    
            }
        }
        
        
        System.out.println("");
    }
}
