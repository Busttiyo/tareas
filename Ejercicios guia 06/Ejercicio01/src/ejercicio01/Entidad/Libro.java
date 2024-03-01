/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por 
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo 
los datos al usuario y luego informar mediante otro método el número de ISBN, el 
título, el autor del libro y el numero de páginas.
 */
package ejercicio01.Entidad;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Libro {
    
    //ATRIBUTOS
    
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int NumeroDePagina;
    
    // CONSTRUCTORES

    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String Autor, int NumeroDePagina) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroDePagina = NumeroDePagina;
    }
    
    //SETTERS AND GETTERS 

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumeroDePagina() {
        return NumeroDePagina;
    }

    public void setNumeroDePagina(int NumeroDePagina) {
        this.NumeroDePagina = NumeroDePagina;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumeroDePagina=" + NumeroDePagina + '}';
    }
    
    public void titulo(){
        setTitulo(leer.nextLine());
    }
    
    Scanner leer = new Scanner(System.in);
    //Metodo crear libro, completa los datos del objeto;
    
    public void crearLibros(){
        
        
         System.out.println("Ingrese el Titulo");
        
        titulo();
        
        
           
        System.out.println("Ingrese el Num. de ISBN");
        
        setISBN(leer.nextInt());
        
       System.out.println("Ingrese el Num. de pagina");
        
        setNumeroDePagina(leer.nextInt());
        
        
        System.out.println("Ingrese el Nombre Del Autor");
        
        
        
    }
    
    
    public void mostrar(){
        System.out.println(toString());
    }
  
    
}
