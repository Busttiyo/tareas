/*
Realizar un programa que pida dos números enteros positivos por teclado y 
muestre
por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa 
deberá mostrar el resultado por pantalla y luego volver al menú. El programa 
deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el 
usuario selecciona la opción 5, en vez de salir del programa directamente, se 
debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir 
del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del 
programa, caso contrario se vuelve a mostrar el menú.
 */
package ejecercicios2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer  = new Scanner(System.in);
        
        String resp = "n";
        
        int num1, num2, opc, respN;
        
        System.out.println("ingrese un numero positivo");
        
        num1= leer.nextInt();
        
        System.out.println("ingrese otro numero positivo");
        
        num2 = leer.nextInt();
        
        do{
            
            System.out.println("======================");
            System.out.println("Menu");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija una opcion:");
            opc = leer.nextInt();
           
            switch (opc){
                case 1:
                    respN = num1 + num2;
                    System.out.println("la suma de "+num1+" + "+num2+" es igual a : "+ respN);
                    break;
                case 2:
                    respN = num1 - num2;
                    System.out.println("la resta de "+num1+" - "+num2+" es igual a : "+ respN);
                    break;
                case 3:
                    respN = num1 * num2;
                    System.out.println("la multiplicacion de "+num1+" * "+num2+" es igual a : "+ respN);
                    break;
                case 4:
                    respN = num1 / num2;
                    System.out.println("la divicion de "+num1+" / "+num2+" es igual a : "+ respN);
                    break;
                case 5:
                    System.out.println("¿Seguro/a de que quiere salir? (s/n)");
                    resp = leer.next();
                    if( resp.equals("s") || resp.equals("S")){
                        break;
                    }else{
                        continue;
                    }
                default:
                    System.out.println("Opcion fuera de rango");
                    break;
            }
        }while(resp.equals("n"));
        
    }
    
}
