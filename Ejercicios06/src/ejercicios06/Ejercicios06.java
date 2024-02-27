/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios06;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicios06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Persona p1 =  new Persona();
        
        System.out.println("ingrese el nombre de la persona");
        p1.setNombre(leer.next());
        
        System.out.println("ingrese el dni");
        p1.setDNI(leer.nextInt());
        
        System.out.println("ingrese la edad");
        p1.setEdad(leer.nextInt());
        
        System.out.println(p1.toString());
        
        
    }
    
}
