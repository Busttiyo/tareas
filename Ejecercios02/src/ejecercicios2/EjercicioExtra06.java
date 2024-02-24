/*
Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package ejecercicios2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjercicioExtra06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        double altura, alturaB, alturaA, promedio, bajos;
        alturaB = 0;
        alturaA = 0;
        int cantidad, petisos, general;
        general = 0;
        petisos = 0;
        System.out.println("ingrese la cantidad de personas a medir");
        
        cantidad = leer.nextInt();
        
        for (int i = 0; i < cantidad; i++){
            System.out.println("ingrese la altura de la persona");
            altura = leer.nextDouble();
            if (altura<=1.60){
                petisos = petisos +1;
                alturaB= alturaB + altura;
                alturaA = alturaA + altura;
            }else{
                alturaA = alturaA + altura; 
            }
        }
        promedio  = alturaA / cantidad;
        bajos = alturaB / petisos;
        System.out.println("el promedio de las personas es: "+promedio);
        System.out.println("el promedio de las personas menores a 1.60 es: "+bajos);
    }
    
}
