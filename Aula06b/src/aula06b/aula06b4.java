/**
 * Nesse programa vamos estudar o uso da depuração de codigo do netbeans 
 */
package aula06b;

/**
 *
 * @author Aluno: Douglas
 */
public class aula06b4 {
    
    public static void main (String args[]){
        
        int numero = 8;
        int cont = 1;
        int total;
        
        while(cont <= 10){
            total= numero * cont;
            System.out.println(numero+" x "+cont+" = "+total);
            cont++;
        }
        
    }
    
}
