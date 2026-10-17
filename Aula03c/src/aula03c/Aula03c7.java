/**
 * nesse programa vamos estudar a estrutura de decisão if..else usabdo o operadoe ! not = não
 */
package aula03c;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula03c7 {
    
    public static void main(String args[]){
        
        int quantEstoque = 0;
        boolean emPromocao = true;
        
        if (!(quantEstoque > 0)){
            JOptionPane.showMessageDialog(null, "Produto Esgotado no momento");
        } else if (emPromocao){
            JOptionPane.showMessageDialog(null, "Produto disponivel com 10% de desconto");
        }else {
            JOptionPane.showMessageDialog(null, "Produto disponivel pra compra sem desconto");
        }
        
    }
    
}
