/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class ejercicioDeEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un proyecto de Java y definir al menos 6 variables en tu IDE de distintos tipos de datos.
        
        String nombre;
        
        int numero;
        
        boolean verdad;
        
        float decimal;
        
        double decimalLargo;
        
        char letra;
        
        
        //¿Recuerdas las variables que creaste en el ejercicio anterior? Ahora deberás asignarles un valor.
        
        nombre = "david";
        
        numero = 4;
        
        verdad = false;
        
        decimal =  (float) 10.50;
        
        decimalLargo = 0.55555;
        
        letra = 'a';
        
        //Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo.
        
        int num1, num2;
        double resultado;
        boolean resultado2;
        
        num1 = 3;
        
        num2 = 2;
        
        resultado = num1 + num2;
        
        System.out.println(resultado);
        
        resultado = num1 - num2;
        
        System.out.println(resultado);
        
        resultado = num1 * num2;
        
        System.out.println(resultado);
        
        resultado = num1 / num2;
        
        System.out.println(resultado);
        
        resultado = +num1;
        System.out.println(resultado);
        
        resultado = -num1;
        System.out.println(resultado);
        
        resultado = ++num1;
        System.out.println(resultado);
        
       
        resultado = --num1;
        System.out.println(resultado);
        
        resultado2 = num1 <= num2;
        System.out.println(resultado2);
        resultado2 = num1 >= num2;
        System.out.println(resultado2);
         resultado2 = num1 == num2;
        System.out.println(resultado2);
         resultado2 = num1 != num2;
        System.out.println(resultado2);
        
        //Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por pantalla.
        
        String nombre2;
        
        int edad;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingresa tu nombre");
        nombre2 = leer.next();
        System.out.println("ingresa tu edad");
        edad = leer.nextInt();
        
        System.out.println("hola "+nombre+" "+" de "+edad+" años." );
        
        
        
        
        
        
        
        
        
    }
    
}
