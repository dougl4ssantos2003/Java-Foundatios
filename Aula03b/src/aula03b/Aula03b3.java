/**
 * Nesse Programa vamos estudar a estrura de decisão if..else usando a caixa de dialogo JOptionPane
 */
package aula03b;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula03b3 {
    
    public static void main (String args[]){
        
        String nomeArquivo = JOptionPane.showInputDialog(null,"Digite o Nome do arquivo","Salvar Arquivo no disco",3);
        
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja Salvar esse Aruivo","Salvar Arquivo no disco",JOptionPane.YES_NO_OPTION,3);
        
        if (resposta == 0){
            JOptionPane.showMessageDialog(null, "Arquivo "+nomeArquivo+" Salvo com Sucesso!!!","Salvar Arquivo no disco",1);
            
        }else {
            JOptionPane.showMessageDialog(null, "Arquivo "+nomeArquivo+" não foi Salvo!!!","Salvar Arquivo no disco",1);
        }
        
    }
    
}
