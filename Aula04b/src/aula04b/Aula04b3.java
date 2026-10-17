/**
 * Nesse programa vamos estdar a estrutura de repetição while e o desvio 'continue'
 */
package aula04b;

/**
 *
 * @author Aluno:Douglas
 */
public class Aula04b3 {
    
    public static void main (String args[]){
        
        int cont =0;
        
        while(cont <=20){
            cont++;
            if(cont%2
                    !=0){
                continue;
            }
            System.out.println("Número par: "+cont);
            
        }
        
    }
    
}
