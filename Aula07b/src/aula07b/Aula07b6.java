/**
 * Nesse programos vamos estudar a visibilidade de uma variavel 
 */
package aula07b;

/**
 *
 * @author Aluno
 */
public class Aula07b6 {
    
     public static int valor;
    
    public static void main (String args[]){
        
      valor = 10;
      calcularTabuada();
        
    }
    
    public static void calcularTabuada(){
        
        for (int i= 1;i <= 10; i++){
            int total = i * valor;
            System.out.println(valor+" X "+i+" = "+total);
        }
         
    }
    
}
