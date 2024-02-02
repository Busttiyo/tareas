/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se 
denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicios04;

/**
 *
 * @author david
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][] matrix = new int [4][4];
        
        matrix = matrix();
        
        imprimirMatris(matrix);
        imprimirMatrisTraspuesta(matrix);
        
    }
    
    //funcion que crear y devuelve matrises
    
    public static int[][] matrix(){
        
        int[][] matrix = new int[4][4];
        
        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                matrix[i][j] = (int) (Math.random()*10);
            }
        }  
        return matrix;
    } 
    
    
    //procedimiento que imprime una matris como esta
    
    public static void imprimirMatris (int [][] matrix){
        
        for (int i = 0; i < 4; i++){
            System.out.println("");    
            for(int j = 0; j < 4; j++){
                System.out.print(matrix[i][j]);
            }
        }
        System.out.println("");
        
    }
    
    //un procemimiento que imprime una matris invertida
    
    public static void imprimirMatrisTraspuesta(int [][] matrix){
        
        for (int i = 0; i < 4; i++){
            System.out.println("");    
            for(int j = 0; j < 4; j++){
                System.out.print(matrix[j][i]);
            }
        }
        System.out.println("");
        
    }
    
}
