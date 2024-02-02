/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package ejercicios04;

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
        
        Dividir(creadorDeVectores());
        
    }
    
    //funcion que cree un vector y lo devuelve;
    
    public static int[] creadorDeVectores(){
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        System.out.println("ingrese el tamaño del vector");
        
        num = leer.nextInt();
        
        int [] vector = new int[num];
        
        for (int i = 0; i < num; i++){
            vector[i] = (int) (Math.random()*100000);
        }
        return vector;
    }
    
    // funcion que divide los numeros por digitos
    
    public static void Dividir(int[] vec){
        
        int d1=0 , d2=0 ,d3=0 , d4=0 , d5=0 ;
        
        for(int i = 0; i < vec.length; i++){
            
            if(vec[i]/1 > 0 && vec[i]/1 < 10 ){
                d1++;
            }
            if(vec[i]/10> 0 && vec[i]/10 < 10 ){
                d2++;
            }
            if(vec[i]/100 > 0 && vec[i]/100 < 10 ){
                d3++;
            }
            if(vec[i]/1000 > 0 && vec[i]/1000 < 10 ){
                d4++;
            }
            if(vec[i]/10000 > 0 && vec[i]/10000 < 10 ){
                d5++;
            }   
        }
        
        System.out.println("numeros de 1 digito "+d1);
        System.out.println("numeros de 2 digito "+d2);
        System.out.println("numeros de 3 digito "+d3);
        System.out.println("numeros de 4 digito "+d4);
        System.out.println("numeros de 5 digito "+d5);
        
    }
    
}
