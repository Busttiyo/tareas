/*
Realice un programa para que el usuario adivine el resultado de una 
multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
El programa debe indicar al usuario si su respuesta es o no correcta. En caso 
que la respuesta sea incorrecta se debe permitir al usuario ingresar su 
respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la 
-función Math.random() de Java.
 */
package ejecercicios2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjercicioExtra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, rp, mul;
        
        
        
        boolean confirmacion = false;
        
        do{
            num1 = (int) (Math.random()*11);
        
            num2 = (int) (Math.random()*11);
            
            mul = num1 * num2;
            System.out.println("dos numeros al azar entre 0 y 10 se multiplican");
            System.out.println(mul);
            System.out.println("cual es el valor de la multiplicacion");
            rp = leer.nextInt();
            if(rp == mul){
                confirmacion = true;
            }
            
        }while(confirmacion == false);
        
    }
    
}
