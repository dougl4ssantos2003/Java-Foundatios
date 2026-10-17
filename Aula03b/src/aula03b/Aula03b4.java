/**
* Nesse Programa vamos estudar a estrutura de decisão if...else if...else
*/
package aula03b;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno:Douglas
 */
public class Aula03b4 {
    
    public static void main (String args[]){
        
     String nomeAluno = JOptionPane.showInputDialog(null,"Digite  nome do Aluno","Escola Celso Charuri",3);
     String mediaStr = JOptionPane.showInputDialog(null,"Digite a Média do Aluno ","Escola Celso Charuri",3);
     
     double media = Double.parseDouble(mediaStr);
     
     String msg;
             
     if (media >=9) {
         msg = "O aluno " +nomeAluno+" Foi Aprovado com Louvor.";
     }else if (media >=6){
        msg = "O aluno " +nomeAluno+" Foi Aprovado .";
    }else if (media >=4){
        msg = "O aluno " +nomeAluno+" Ficou de recuperação .";
    }else{
        msg = "O aluno "+nomeAluno+" Reprovou";
    }
     
     JOptionPane.showMessageDialog(null,msg,"Escola Celso Charuri",1);
        
    }
    
}
