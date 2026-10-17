/*
 *Nesse progrma vamos estudar a estrutura de repetição while com a condição de loop infinito sendo interrompido pela ação do usúario
 */
package aula04b;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno:Douglas
 */
public class Aula04b5 {
    
    public static void main(String agrs[]){
        
        String titulo = "Nomes Diversos";
        String msg  = "";
        
        while(true){
            String nome = JOptionPane.showInputDialog(null,"Digite um nome qualquer:",titulo,1);
            msg = msg + nome;
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja Digitar outro nome?",titulo,JOptionPane.YES_NO_OPTION,3);
            if(resposta ==1){
                msg = msg + ".";
                break;
            }else{
                msg = msg+ " , ";
            }
        }
        
        JOptionPane.showMessageDialog(null, msg,"Nomes Digitados",1);
    }
    
}
