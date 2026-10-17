/**
 *  Nesse programa vamos estudar a estrura de repetição while e o uso do break para enterrumper o loop.
 */
package aula04b;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula04b2 {
    
    public static void main(String args[]){
        
        int cont = 10;
        
        while (cont <= 10){
            System.out.println("Contador: "+cont);
            cont--;
            if(cont <0){
                break;
            }
            
        }
        
    }
    
}
