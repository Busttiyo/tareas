/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de 
números pares y la cantidad de números impares. Al igual que en el ejercicio 
anterior los números negativos no deben sumarse. Nota: recordar el uso de la 
sentencia break.
 */
package ejecercicios2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjercicioExtra08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        int par = 0;
        int impar = 0;
        int cantidad = 0;
        
        
        do{
            System.out.println("ingrese un numero");
            num = leer.nextInt();
            cantidad++;
            if(num%2==0){
                par ++;
            }else{
                impar ++;
            }
        }while(num%5!=0);
            
        System.out.println("cantidad de numeros analisados: "+cantidad);
        System.out.println("cantidad de numeros pares: "+par);
        System.out.println("cantidad de numeros impares: "+impar);
        
    }
    
}
