/**
 * Nesse programa vamos estudar a estrutura de reptição for 
 */
package aula05b;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula05b {

    public static void main(String[] args) {
        
        for (int cont = 1; cont<=10; cont++){
            System.out.println("Contador: "+cont);
        }
        
        System.out.println("-".repeat(40));
        
        for (int i = 10; i >= 0; i--){
            System.out.print(i+"...");
        }
        System.out.println("FOGO !!!");
        
        System.out.println("-".repeat(40));

        for (int i=0; i<=50; i+=2){
        System.out.print(i+" ");
    }
        
        System.out.println("-".repeat(40));
        
        int soma = 0;
        for (int i=1; i<=100; i++){
            soma+=i;
            
        }
        
        System.out.println("A soma dos Numeros de 1 ate 100 e "+soma);
    }
    
}
