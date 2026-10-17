/**
 * Nesse programa vamos estudar a estrutura de repetição for com comandos break e continue
 */
package aula05b;

/**
 *
 * @author Aluno:douglas
 */
public class Aula05b5 {
    
    public static void main (String args[]){
        
        for (int i = 1; i <= 9999; i++){
            System.out.println("Contador: "+i);
            if(i >=15){
                break;
            }
            
        }
        System.out.println("Fim do Primeiro LOOP");
        System.out.println("=".repeat(100));
        
        for(int i = 0; i <= 20; i++){
            if (i % 2 !=0){
                continue;
            }
            System.out.println("Numero Par: "+i);
        }
        
    }
    
}
