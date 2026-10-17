/**
 * Nesse Programa vamos estudar a importação de bibliotecas java e o uso
 * da bliblioteca JOptionPane.
*/
package aula02e;
import javax.swing.JOptionPane;
/**
 * @author Aluno: Douglas
 */
public class Aula02e {

    public static void main(String[] args) {
        
        String titulo = "Curso de Java";
        JOptionPane.showMessageDialog(null,"Olá Mundo!!!",titulo,
                JOptionPane.WARNING_MESSAGE);
        
        String nome = JOptionPane.showInputDialog(null,"Digite o nome do aluno",titulo,3);
        
        JOptionPane.showMessageDialog(null, "Voce digitou "+nome,titulo,1);
       
        String strNota1 = JOptionPane.showInputDialog(null,"Digite a 1° nota",titulo,3);
        String strNota2 = JOptionPane.showInputDialog(null,"Digite a 2° nota",titulo,3);
        String strNota3 = JOptionPane.showInputDialog(null,"Digite a 3° nota",titulo,3);
        
        double nota1 = Double.parseDouble(strNota1);
        double nota2 = Double.parseDouble(strNota2);
        double nota3 = Double.parseDouble(strNota3);
        
        double media = (nota1 + nota2 + nota3 ) /3;
        
        String msg = String.format("O aluno %s obteve a média %.1f nas "+ "Avaliações",nome,media);
        JOptionPane.showMessageDialog(null, msg,titulo,1);
        
    }
    
}
