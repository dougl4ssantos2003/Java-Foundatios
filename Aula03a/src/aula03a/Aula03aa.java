/**
* Nesse programa vamos estudar os operadores de incrementos e decremento;
*/
package aula03a;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula03aa {
    
    public static void main (String args[]){
        
        int numero = 5;
        
        System.out.println("Valor de numero: "+numero);
        
        numero++; //Equivalente a numero + numero + 1
        
        System.out.println("Novo valor de numero (++): "+numero);
        
        numero--; //Equivalente a numero - numero - 1
        
        System.out.println("Novo valor de numero (--): "+numero);
        
        int numero2 = numero++;
        
        System.out.println("Variavel numero: " +numero);
        System.out.println("Variavel numero2: " +numero2);
        
        numero2 = ++numero;
        
        System.out.println("Variavel numero: " +numero);
        System.out.println("Variavel numero2: " +numero2);
        
    }
    
    
}
