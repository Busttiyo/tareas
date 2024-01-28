/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de 
equipo y define su tipo de dato de tal manera que te permita alojar sus nombres 
más adelante.

Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus 
compañeros de equipo

 */
package ejercicios04;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjerciciosDeEjemplo01y02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String[] Equipo = new String[3];
        
        for (int i = 0; i < 3; i++){
            
            System.out.println("ingrese el nombre del integrante del equipo");
            Equipo[i] = leer.nextLine();
            
        }
        
        for (int i = 0; i < 3; i++){
            
            System.out.println(Equipo[i]); 
            
        } 
        
        
    }
    
    
}
