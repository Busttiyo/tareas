/*
Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice 
que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz 
traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas 
por columnas (o viceversa).
 */
package ejercicios04;

/**
 *
 * @author david
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] matrix1 = new int[3][3];
        
        int[][] matrix2 = new int[3][3];
        
        int[][] matrix3 = new int[3][3];
        
        matrix1 = matrix();
        
        matrix2 = matrixTraspueta(matrix1);
        
        matrix3 = matrix();
        
        imprimirMatris(matrix1);
        
        imprimirMatris(matrix2);
        
        imprimirMatris(matrix3);
        
        respuesta(mTraspuesta(matrix1, matrix2));
        System.out.println("");
        respuesta(mTraspuesta(matrix1, matrix3));
        
    }
    
    
    //funcion que crear y devuelve matrises
    
    public static int[][] matrix(){
        
        int[][] matrix = new int[3][3];
        
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrix[i][j] = (int) (Math.random()*10);
            }
        }  
        return matrix;
    }
    
    //procedimiento que imprime una matris como esta
    
    public static void imprimirMatris (int [][] matrix){
        
        for (int i = 0; i < 3; i++){
            System.out.println("");    
            for(int j = 0; j < 3; j++){
                System.out.print(matrix[i][j]);
            }
        }
        System.out.println("");
        
    }
    
    //funcion que crea una matris traspuesta ()
    
    public static int[][] matrixTraspueta(int [][] matrix){
        int [][] matrixT = new int [3][3];
        
        for (int i = 0; i < 3; i++ ){
            for (int j = 0; j < 3; j++){
                matrixT[i][j]=matrix[j][i];
            }
            
        }  
        return matrixT;
    }

    // funcion  que recibe dos matrises y devuelve true si son traspuestas
    
    public static boolean mTraspuesta(int [][] m1, int [][] m2){
    
        boolean confirmar = false;
        
        for (int i = 0; i < 3; i++ ){
            for (int j = 0; j < 3; j++){
                if (m1[i][j] != m2[j][i]){
                    break;
                }else{
                    confirmar = true;
                }
            }   
        } 
        return confirmar;
    }
    
    //procedimiento que muestra por pantalla si la matris es traspuesta o no
    
    public static void respuesta (boolean r){
        
        if (r == true){
            System.out.println("la matris A y la matris B son Traspuestos");
        }else{
            System.out.println("la matris A y la matris B no son Traspuestos");
        }
    }
    
}
