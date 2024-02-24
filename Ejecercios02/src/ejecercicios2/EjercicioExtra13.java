/*
Crear un programa que dibuje una escalera de números, donde cada línea de 
números comience en uno y termine en el número de la línea. Solicitar la altura 
de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
 */
package ejecercicios2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjercicioExtra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num, aux = 0;
        
        System.out.println("ingrese el numero para la escalera");
        num = leer.nextInt();
        
        do{
            aux ++;
            System.out.println(aux);
        }while(aux != num);
        
        //me aburri de pensar :p 
    }
    
}
