/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el 
usuario, validando que el primer número múltiplo del segundo e imprima si el 
primer número es múltiplo del segundo, sino informe que no lo son.
 */
package ejercicios03;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjercicioDeEjemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        int num2;
        
        System.out.println("ingrese un numero");
        num = leer.nextInt();
        
        System.out.println("ingrese un numero que sea multiplo del primero");
        num2 = leer.nextInt();
        
        esMultiplo(num, num2);
        
    }
    
    public static void esMultiplo (int num, int num2){
        if(num2%num== 0){
            System.out.println(num2+" es multiplo de "+num);
        }else{
            System.out.println(num2+" no es multiplo de "+num);
        }
    }
    
}
