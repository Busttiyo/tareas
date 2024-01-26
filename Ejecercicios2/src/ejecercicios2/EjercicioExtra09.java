/*
Simular la división usando solamente restas. Dados dos números enteros mayores 
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo 
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor 
que el divisor, este resultado es el residuo, y el número de restas realizadas 
es el cociente.


Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

 */
package ejecercicios2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjercicioExtra09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, cos = 0, res = 0;
       
        System.out.println("ingrese un numero");
            
        num1  = leer.nextInt();
           
        System.out.println("ingrese un numeor para que sea dividido");
            
        num2 = leer.nextInt();
            
         do{
             if (num1 >= num2){
                 num1 = num1 - num2;
                 cos ++;
             }else{
                 res = num1;
             }
         }while(res ==0);
        System.out.println("la divicion dio como resultado "+cos+" de cosiente y "+res+" de resto");
    }
    
}
