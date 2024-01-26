/*
Escribir un programa que procese una secuencia de caracteres ingresada por 
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de 
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la 
tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se 
mantienen sin cambios.

a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la 
codificación correspondiente. Utilice la estructura “según” para la 
transformación. 

 */
package ejercicios03;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjercicioDeEjemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String frace;
        
        System.out.println("Ingrese una frace a codificar ");
        
        frace = leer.nextLine();
        
        System.out.println(codificador(frace));
        //charAt(int index)
        
        // replace(char oldChar, char newChar)
        
    }
    
    public static String codificador (String f){
        
        String codificado;
        
        f = f.replace("a", "@");
        f = f.replace("e", "#");
        f = f.replace("i", "$");
        f = f.replace("o", "%");
        f = f.replace("u", "*");
        
        codificado = f;
       
      
        return codificado;
    }
    
    
    
}
