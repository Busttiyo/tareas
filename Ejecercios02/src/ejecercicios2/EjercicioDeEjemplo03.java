/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 
0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package ejecercicios2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjercicioDeEjemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int nota;
        
        System.out.println("ingresa tu nota");
        
        nota = leer.nextInt();
        
        while(nota>0 && nota <10){
            System.out.println("ingresa tu nota");
            nota = leer.nextInt();
        }
    }
    
}
