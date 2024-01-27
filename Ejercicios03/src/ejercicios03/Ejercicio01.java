/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para 
cada operación matemática y deben devolver sus resultados para imprimirlos en el 
main. 
 */
package ejercicios03;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, rp;
        
        //Establecer valores iniciales
        
        System.out.println("ingrese un numero");
        num1 = leer.nextInt();
        
        System.out.println("ingrese otro numero");
        num2 = leer.nextInt();
        
        //menu
        
        System.out.println("MENU");
        System.out.println("1.Sumar");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Dividir");
        rp = leer.nextInt();
        
        switch (rp){
            case 1:
                System.out.println("el resultado de Sumar "+num1+" y "+num2+" es igual a: "+Suma(num1,num2));
                break;
            case 2:
                System.out.println("el resultado de Restar "+num1+" y "+num2+" es igual a: "+Resta(num1,num2));
                break;
            case 3:
                System.out.println("el resultado de Multiplicar "+num1+" y "+num2+" es igual a: "+Multiplicar(num1,num2));
                break;
            case 4:
                System.out.println("el resultado de Divivir "+num1+" y "+num2+" es igual a: "+Dividir(num1,num2));
                break;
            default:
                System.out.println("valor ingresado no valido");
             
        }
        
        
        
    }
    
    //funcion de dividir
    
    public static double Dividir(int n1, int n2){
        
        double resto;
        
        resto = n1 / n2;
        
        return resto;
    }
    
    // funcion de multiplicar
    
    public static int Multiplicar(int n1, int n2){
        
        int resto;
        
        resto = n1 * n2;
        
        return resto;
    }
    
    // funcion de resta
    
    public static int Resta(int n1, int n2){
        
        int resto;
        
        resto = n1 - n2;
        
        return resto;
    }
     
    //funcion de suma
    
    public static int Suma(int n1, int n2){
        
        int resto;
        
        resto = n1 + n2;
        
        return resto;
    }
    
    
    
}
