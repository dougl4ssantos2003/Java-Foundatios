/**
 * Nesse programa vamos estudar o uso de operadores aritméticos  
 */
package aula03a;

/**
 *
 * @author Aluno: Douglas 
 */
public class Aula03a {

    public static void main(String[] args) {
       
        int numero = 10;
        
        System.out.println("Valor da variavel numero: " + numero);
        
        numero = numero + 5;
        
        System.out.println("Valor da variavel numero (+5): " + numero);
        
         //Soma
        
        numero += 20; //equivalente numero = numero + 20;
        
        System.out.println("Valor da variavel numero (+20): " + numero);
        
         //subtração
        
        numero -=7; // equivalente numero = numero - 7;
        
        System.out.println("Valor da variavel numero (-7): " + numero);
        
        //multipilicação
        
        numero *= 3; // equivalente numero = numero * 3;
        
        System.out.println("Valor da variavel numero (*3): " + numero);
        
         //Divisão
        
        numero /= 2; // equivalente numero = numero / 2;
        
        System.out.println("Valor da variavel numero (/2): " + numero);
        
         //Modulo resto da divisão 
        
        numero %= 5; // equivalente numero = numero % 5;
        
        System.out.println("Valor da variavel numero (%5): " + numero);
        
    }
    
}
