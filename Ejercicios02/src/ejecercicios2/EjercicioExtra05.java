/*
Una obra social tiene tres clases de socios:
°Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
todos los tipos de tratamientos.

°Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para 
los mismos tratamientos que los socios del tipo A.

°Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
dichos tratamientos.

Solicite una letra (carácter) que representa la clase de un socio, y luego un 
valor real que represente el costo del tratamiento (previo al descuento) y 
determine el importe en efectivo a pagar por dicho socio.

 */
package ejecercicios2;

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
        
        Scanner leer = new Scanner(System.in);
        
        String os;
        
        int costo;
        
        System.out.println("ingrese el nivel de obra social (a, b, c)");
        
        os = leer.next();
        
        System.out.println("ingrese el costo de la operacion");
        
        costo = leer.nextInt();
        
        switch (os){
            case "a":
                costo = (int) (costo - (costo*0.5));
                System.out.println("el total a pagar por el tratamiento es de: "+costo);
                break;
            case "b":
                costo = (int) (costo - (costo*0.35));
                System.out.println("el total a pagar por el tratamiento es de: "+costo);
                break;
            case "c":
                System.out.println("el total a pagar por el tratamiento es de: "+costo);
                break;
            default:
                System.out.println("nivel no reconocido");
        }
        
    }
    
}
