/**
 * Nesse programa vamos fazer revisão da depuração
 */
package aula07a;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Aula07a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] notas = new double[4];
        while (true) {
            try {
                for (int i = 0; i < 4; i++) {
                    String nota = JOptionPane.showInputDialog("Entre com a Nota "+(i + 1));
                    nota = nota.replace(",", ".");
                    notas[i] = Double.parseDouble(nota);
                }
                double somaNotas = 0;
                for (int i = 0; i < 4; i++) {
                    somaNotas += notas[i];
                }
                double media = somaNotas / notas.length;
                JOptionPane.showMessageDialog(null, "Média do Aluno " + String.format("%.2f", media));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas numeros para as notas dos Alunos"+"\n Digite as Notas Novamente");
            }
        }
    }
}
