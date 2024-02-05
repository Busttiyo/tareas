/*
Los profesores del curso de programación de Egg necesitan llevar un registro de 
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de 
aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones 
de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al
final del programa los profesores necesitan obtener por pantalla la cantidad de 
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con 
promedio mayor o igual al 7 de sus notas del curso.

 */
package ejercicios04;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjercicioExtra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        notificacion();
        
    } 
    
    //funcion que cree un vector con las cuatro notas
    
    public static int [] notas(){
        
        Scanner leer = new Scanner(System.in);
        
        int [] n = new int[4];
        
        for(int i = 0;i < 4; i++ ){
            System.out.println("nota "+(i+1));
            n[i]= leer.nextInt();
        }
        
        return n;
    }   
    
    // funcion que recive un vector con notas y devuelve un promedio
    
    public static double promedio(int [] n){
       
       double promedio = 0;
       
       for(int i = 0; i < n.length; i++){
           
           switch (i) {
               case 0:
                   promedio += n[i]*0.1;
                   break;
               case 1:
                   promedio += n[i]*0.15;
                   break;
               case 2:
                   promedio += n[i]*0.25;
                   break;
               default:
                   promedio += n[i]*0.5;
                   break;
           }
       }
       
       return promedio;
    }
    
    //funcion que devuelve true si un alucno estat aprovado o no
    
    public static boolean calificar( double i){
        
        boolean calificado = false;
        
        if (i >= 7){
            calificado = true;
        }
        
        return calificado;
        
    }
    
    //procedimiento que toma una cantidad de alunos y califica su estan 
    //aprovados o no y muestra por pantalla cuantos aprovaron y cuantos no
    
    public static void notificacion(){
        
        int aprovados = 0, desaprovados = 0;
        
        for(int i = 0; i < 10; i++){
            if (calificar(promedio(notas())) == true){
                aprovados += 1;
            }else{
                desaprovados += 1;
            }
        }
        
        System.out.println("la cantidad de aprovador es de: "+aprovados);
        System.out.println("la cantidad de desaprovador es de: "+desaprovados);
        
    }
}
