/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre 
su equivalente en romano.
 */
package ejecercicios2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjercicioExtra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int numero;
        
        System.out.println(" ingrese un numero entre 1 / 10");
        numero = leer.nextInt();
        
        switch (numero){
            case 1:
                System.out.println("1 es igual a I en numeros romanos");
                break;
            case 2:
                System.out.println(" 2 es igual a II en numeros romanos");
                break;
            case 3:
                System.out.println(" 3 es igual a III en numeros romanos");
                break;
            case 4:
                System.out.println(" 4 es igual a IV en numeros romanos");
                break;
            case 5:
                System.out.println(" 5 es igual a V en numeros romanos");
                break;
            case 6:
                System.out.println(" 6 es igual a VI en numeros romanos");
                break;
            case 7:
                System.out.println(" 7 es igual a VII en numeros romanos");
                break;
            case 8:
                System.out.println(" 8 es igual a VIII en numeros romanos");
                break;
            case 9:
                System.out.println(" 9 es igual a IX en numeros romanos");
                break;
            case 10:
                System.out.println(" 10 es igual a X en numeros romanos");
                break;
            default:
                System.out.println("numero fuera de rango");
        }
    }
    
}
