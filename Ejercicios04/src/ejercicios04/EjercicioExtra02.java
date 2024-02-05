/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre 
los elementos).
 */
package ejercicios04;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjercicioExtra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("los dos vectores tienen que tener la misma longitud");
        
        mensaje(verificar(crearVector(), crearVector()));
        
        
    }
    
    //funcion que crear vectores y los devuelve llenos
    
    public static int [] crearVector(){
        
        Scanner leer = new Scanner(System.in);
        
        int tamaño;
        
        System.out.println("ingresar el manaño del vector");
        
        tamaño = leer.nextInt();
        
        int [] vector = new int [tamaño];
        
        for(int i = 0; i < tamaño; i++){
            System.out.println("ingrese un numero par ael vector");
            vector[i] = leer.nextInt();
        }
        
        return vector;
    }
    
    //funcion que comprueva que dos vectores son iguales 
    
    public static boolean verificar(int [] m, int [] n){
        
        boolean verificar  = true;
        
        for(int i = 0; i < m.length; i++){
            if(m[i]!=n[i]){
                verificar = false;
                break;
            }
        } 
        
        return verificar;
    }
    
    //procedimiento que envia un mensafe en funcion de que si le llefa un verdadero o falso;
    
    public static void mensaje( boolean m ){ 
        if (m == true){
            System.out.println("los dos vectores son iguales");
        }else{
            System.out.println("los vectores bson diferentes");
        }
    }
    
}
