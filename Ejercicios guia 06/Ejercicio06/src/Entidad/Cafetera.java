/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Entidad;

/**
 *
 * @author david
 */
public class Cafetera {
    //Atributos
    private int capacidadMaxima;
    
    private int cantidadActual;
    
    //Constructores

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    
    //Setters and Getters

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    //metodo
    
    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
    //máxima.
    
    public void llenarCafetera(){
        setCantidadActual(getCapacidadMaxima());
        
    }
    
    /*
    Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    cuanto quedó la taza.
    */
    
    public void servirTaza(int cantidad){
        if (cantidad <= getCantidadActual()) {
            System.out.println("taza llena");
            setCantidadActual(getCantidadActual()-cantidad);
        }else if (cantidad > getCantidadActual()){
            setCantidadActual(0);
            System.out.println("solo se a llegado a llenar la taza con "+ cantidad);
        }
    }
    
    //Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(){
        setCantidadActual(0); 
    }
  
    /*
    Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    recibe y se añade a la cafetera la cantidad de café indicad.
    */
    
    public void agregarCafe(int i){
        setCantidadActual(i);
    }
}
