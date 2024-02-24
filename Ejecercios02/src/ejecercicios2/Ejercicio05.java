/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a 
continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.
 */
package ejecercicios2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int limite, num;
        
        num = 0;
        
        System.out.println("ingrese un numero limite");
        
        limite= leer.nextInt();
        
        while(num<limite){
            int num2;
            System.out.println("ingrese otro numero");
            num2= leer.nextInt();
            num = num+num2;
        }
    }
    
}
