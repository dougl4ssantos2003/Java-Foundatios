/**
 * Nesse Programa vamos estudar a estrutura de decisão if...else com o operador logico || our = ou
 */
package aula03c;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula03c4 {
    
    public static void main (String args[]){
        
        int idade = 18;
        String acompanhadoResp = "Não";
        
        if (idade >=18 || acompanhadoResp.equals("Sim")){
            JOptionPane.showMessageDialog(null, " Acesso liberado!!");
  
        }else{
            JOptionPane.showMessageDialog(null, "Acesso Negado");
        }
            
        
        
    }
    
}
