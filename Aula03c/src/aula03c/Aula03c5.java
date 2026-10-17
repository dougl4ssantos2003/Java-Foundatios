/**
 * Nesse Programa vamos estudar a estrutura de decisão if...else com o operador logico || our = ou
 */
package aula03c;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula03c5 {
    
    public static void main (String args[]){
        
        int idade = 70;
        
        if (idade < 18 || idade > 65){
            JOptionPane.showMessageDialog(null, "Você não atende os requisitos pra doação de Sangue.");
            
        }else{
             JOptionPane.showMessageDialog(null, "Dirija-se ao balcão de triagem.");
        }
        
    }
    
}
