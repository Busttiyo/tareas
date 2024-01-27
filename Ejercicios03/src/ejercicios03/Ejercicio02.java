/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si son mayores o menores 
de edad. Después de cada persona, el programa debe preguntarle al usuario si 
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra 
“No”.
 */
package ejercicios03;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
     repetir();
        
        
    }
    
    // funcion de verificacion de edad
    
    public static boolean mayores (int edad){
        
        boolean verificado = false;
        
        if (edad>=18){
            verificado = true;
        }
        
        return verificado;
    }
    
    //procedimiento de persona
    
    public static void persona(){
        
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        
        int edad;
        
        System.out.println("ingrese El nombre de la persona");
        
        nombre = leer.nextLine();
        
        System.out.println("ingrese su edad");
        
        edad = leer.nextInt();
        
        System.out.println(nombre);
        System.out.println(edad);
        if (mayores(edad)){
            System.out.println("es mayor de edad");
        }else{
            System.out.println("es menor de edad");
        }
        
    }
    
    //procdimiento repetir
    
    public static void repetir(){
        
        String r;
        
        Scanner leer = new Scanner(System.in);
        
        do{
            persona();
            System.out.println("desea ingresar otra persona (si/no?)");
            r = leer.next();
            
            
        }while(r.equals("si"));
        
    }
    
}
