/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
del 0-0-0 al 9-9-9, con la particularidad que 
cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
 */
package ejecercicios2;

/**
 *
 * @author david
 */
public class EjercicioExtra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int d1 = 0, d2 =0, d3 = 0;
        boolean comprobador = false;
        do{
            
            d1 ++;
            if (d1 == 10 ){
                d2++;
                d1 = 0;
            }
            if(d2 == 10){
               d3 ++;
               d2 = 0;  
            }
            if (d3 != 3){
                System.out.print(d3);
            }else{
                System.out.print("E");
            }
            if (d2 != 3){
                System.out.print(d2);
            }else{
                System.out.print("E");
            }
            if (d1 != 3){
                System.out.print(d1);
            }else{
                System.out.print("E");
            }
            System.out.println(" ");
            
            if (d3 == 9 && d2 == 9 && d1 == 9){
                comprobador  = true;
            }
            
        }while(comprobador == false);
        
    }
    
}
