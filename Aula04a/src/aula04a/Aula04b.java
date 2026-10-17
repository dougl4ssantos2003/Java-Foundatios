/**
 * NESSE programa vamos continuar a explorar a estrutura sde controle switch case 
 */
package aula04a;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula04b {
    
    public static void main (String args[]){
        
        String nota = JOptionPane.showInputDialog(null,"Digite a nota do Alunno","Escola Celso Charuri",3);
        
        nota = nota.toUpperCase();
        
        switch(nota){
            
            case"A":
                JOptionPane.showMessageDialog(null, "O aluno foi aprovado com nota Maxima.Sua nota foi  "+nota,"Escola Celso Charuri",1);
                break;
            case"B":
                JOptionPane.showMessageDialog(null, "O aluno foi aprovado com uma nota Excelente. Sua nota foi "+nota,"Escola Celso Charuri",1);
                break;
            case"C":
                JOptionPane.showMessageDialog(null, "O aluno foi aprovado com nota "+nota,"Escola Celso Charuri",1);
                break;
            case"D":
                JOptionPane.showMessageDialog(null, "O aluno ficou de recuperação. Sua nota foi "+nota,"Escola Celso Charuri",1);
                break;
            case"E":
                JOptionPane.showMessageDialog(null, "O aluno foi Reprovado. Sua nota foi "+nota,"Escola Celso Charuri",1);
                break; 
            default:  
                JOptionPane.showMessageDialog(null, "Nota digitada inválida ","Escola Celso Charuri",1);
        }
        
    }
    
}
