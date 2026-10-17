/**
 * nesse programa vamos estudar a estrutura de decisão if..else usabdo o operadoe ! not = não
 */
package aula03c;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula03c6 {
    
    public static void main (String args[]){
        
        String camisa = "Verde"; 
        
        if (!(camisa.equals("Rosa"))){
            JOptionPane.showMessageDialog(null, "Essa cor de Camisa eu aceito");
        }else {
            JOptionPane.showMessageDialog(null, "Essa cor de Camisa eu não aceito");
        }
        
        
    }
    
}
