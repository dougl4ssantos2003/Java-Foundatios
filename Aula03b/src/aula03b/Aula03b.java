/**
 * Nesse programa Vamos estudar a estrutura de decisão if
 */
package aula03b;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno: Douglas
 */
public class Aula03b {

    
    public static void main(String[] args) {
            
       String idadeStr = JOptionPane.showInputDialog(
               null,
               "Digite sua idade:",
               "Aula 3", 3);
            
        int idade = Integer.parseInt(idadeStr);
        
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null,
                    "Você é Maior de idade.",
                    "Aula 3",1);
        }
        System.out.println("Fim do Programa");
        
        
    }
    
}
