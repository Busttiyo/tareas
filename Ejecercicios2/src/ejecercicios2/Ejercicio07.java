/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el 
primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y 
toda secuencia distinta de FDE, que no respete el formato se considera 
incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar 
cómo se utilizan las siguientes funciones de Java Substring(), Length(), 
equals().
 */
package ejecercicios2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int corr = 0, inc;
        String codigo;
        do{
            System.out.println("ingres el codigo de solo 5 caracteres y que comiense con x y finalize con o");
            codigo = leer.nextLine();
            if (codigo.length() == 5 && codigo.subSequence(0, 1).equals("x") && codigo.subSequence(3, 4).equals("o")){
                
                corr ++;
                
                System.out.println(corr);
            }else
                System.out.println(corr);
        }while(!codigo.equals("&&&&&"));
    }
    
}
