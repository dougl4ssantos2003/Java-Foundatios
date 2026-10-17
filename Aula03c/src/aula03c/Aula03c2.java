/**
 * Nesse programa vamos estudar estrutura de decisão if..else
 *  coms os operanddores logicos && (and = e),|| (our = ou) e no
 */
package aula03c;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno:Douglas
 */
public class Aula03c2 {
    
    public static void main (String args[]){
        
      double media = 11 ;
      
      if (media >=4 && media <6){
          JOptionPane.showMessageDialog(null, "Aluno de Recuperação");
      }else if (media >=6 && media <=10){
          JOptionPane.showMessageDialog(null, "Aluno Aprovado");
      }else if (media >=0 && media <=4){
          JOptionPane.showMessageDialog(null, "Aluno Reprovado");
      }else {   
          JOptionPane.showMessageDialog(null, "Média informada invalida");
      }
        
    }
    
}
