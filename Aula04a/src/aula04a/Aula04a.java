/**
 * nesse programa vamos estudar as estruturas de controle switch case
 */
package aula04a;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula04a {


    public static void main(String[] args) {
       
       String pccaoStr = JOptionPane.showInputDialog(null,"Digite uma opcção (1,2 ou 3)","Menu do Sistema",1); 
       int opcao =Integer.parseInt(pccaoStr);
       
       switch(opcao){
           case 1: 
               JOptionPane.showMessageDialog(null, "Você escolheu a opção 1","Menu Sistema",2);
            break;
           
           case 2: 
               JOptionPane.showMessageDialog(null, "Você escolheu a opção 2","Menu Sistema",2);
           break;
           
           case 3: 
               JOptionPane.showMessageDialog(null, "Você escolheu a opção 3","Menu Sistema",2);
            break;
          default: JOptionPane.showMessageDialog(null, "Opção Invalida!","Menu Sistema",2);
               
       }
        
    }
    
}
