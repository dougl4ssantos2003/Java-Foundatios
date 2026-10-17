/***
 * Nesse programa vamos estudar a estrutura de decisão if...else com o operador && and = e
 */
package aula03c;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula03c3 {
    
    public static void main(String args[]){
        
       double valorCompra = 1300;
       String formaPagamento = "DINHEIRO";
       
       if (valorCompra >= 1000 && formaPagamento.equals("PIX")){         
         JOptionPane.showMessageDialog(null, "PARABÉNS!!! Você ganho 15% de desconto"); 
         
       }else if (valorCompra >= 1000 && formaPagamento.equals("CARTÃO")){        
         JOptionPane.showMessageDialog(null, "PARABÉNS!!! Você ganho 10% de desconto");
                            
       }else {        
         JOptionPane.showMessageDialog(null, "Valor total R$: "+String.format("%.2f", valorCompra));           
       }
       
        
    }
    
}
