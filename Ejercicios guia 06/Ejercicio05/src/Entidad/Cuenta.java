/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Cuenta {
    
    Scanner leer = new Scanner(System.in);
    
    //Atributos
    
    private int numeroCuenta;
    
    private long DNI;
    
    private int saldo;
    
    private int interes;
    
    //Constructors 

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, int saldo, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
        this.interes = interes;
    }
    
    //Setters and Getters

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }
       
    //Metodos

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", DNI=" + DNI + ", saldo=" + saldo + ", interes=" + interes + '}';
    }
    
    //Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    
    public void crearCuenta(){
        System.out.println("ingrese el numero de cuenta");
        setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI");
        setDNI(leer.nextLong());
        System.out.println("ingrese su saldo Actual");
        setSaldo(leer.nextInt());
    }
    
    //Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
    //y se la sumara a saldo actual.
    
    public void ingresar(int cantidad){
        int suma, valor;
        valor = getSaldo();
        suma= valor + cantidad;
        setSaldo(suma);    
    }
    
    //Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
    //la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    //pondrá el saldo actual en 0.
    
    public void retiro(int cantidad){
        int suma, valor;
        valor = getSaldo();
        if(valor >= cantidad){
            suma= valor - cantidad;
        }else{
            suma=0;
        }
        
        setSaldo(suma);
    }
    
}
