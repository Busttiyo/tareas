/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y 
el promedio de n números (n>0). El valor de n se solicitará al principio del 
programa y los números serán introducidos por el usuario. Realice dos versiones 
del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */
package ejecercicios2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjercicioExtra07Version2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num, mayor =0 , menor = 1000000000 , bolsa = 0, contador = 0, promedio = 0;
        
        String pregunta;
        
        
        do{
            System.out.println("ingrese un numero");
            num = leer.nextInt();
            if(num>mayor){
                mayor = num;
                bolsa = bolsa + num;
            }else if (num< menor){
                menor = num;
                bolsa = bolsa + num;
            }
            contador ++; 
           System.out.println("desea agregar un numero (s/n)");
           pregunta = leer.next(); 
           
        }while(pregunta.equals("s"));
        
        promedio = bolsa/contador;
        System.out.println("numero mayor es: "+mayor);
        System.out.println("el numero menor es: "+menor);
        System.out.println("el promedio de todos los numeros ingresados es de: "+promedio);
    }
    
}
