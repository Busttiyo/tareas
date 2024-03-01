/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por 
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo 
los datos al usuario y luego informar mediante otro método el número de ISBN, el 
título, el autor del libro y el numero de páginas.
 */
package ejercicio01;

import ejercicio01.Entidad.Libro;
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
        Libro l = new Libro();
        
        l.crearLibros();
        l.setAutor(leer.nextLine());
        l.mostrar();
        
    }
   
    
    
    
    
}
