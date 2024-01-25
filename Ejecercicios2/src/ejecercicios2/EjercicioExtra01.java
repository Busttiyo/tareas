/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 
si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 
día, 2 horas.
 */
package ejecercicios2;

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
        
        Scanner leer = new Scanner(System.in);
        
        int dia = 0, horas = 0, minutos;
        
        System.out.println(" ingrese la cantidad de minutos ");
        
        minutos = leer.nextInt();
        
        if (minutos >= 60){
            horas = minutos / 60;
            if (horas>=24){
                dia = horas / 24;
                horas = horas - dia * 24;
            }
        }
        
        System.out.println("la cantidad de minutos: "+minutos+" es igual a "+horas+" horas y a "+dia+" dias");
    }
    
}
