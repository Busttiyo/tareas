/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de 
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá 
imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.
 */
package ejecercicios2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String frace;
        
        System.out.println("ingrese una frace que solo tenga 8 letras");
        
        frace = leer.nextLine();
        
        if (frace.length() == 8){
            System.out.println("Correcto");
        }else{
            System.out.println("incorrecto");
        }
    }
    
}
