/**
 * Nesse programa vamos estudar o uso da estrutura de repetição do...while em coparação com a estrutura while
 */
package aula05a;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula05a {

    public static void main(String[] args) {
        
        
        int cont = 20;
        
        while (cont <=10){
            System.out.println("Contador"+cont);
            cont++;
        }
        
        
        do{
           System.out.println("Novo Contador"+cont);
            cont++; 
        }while(cont <=10);
        
    }
    
}
