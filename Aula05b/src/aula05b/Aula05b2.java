/**
 * nesse Programa vamos estudar a estrutura de repeticção for para imprimir a tabuada de um numero solicitado pelo usuário
 */
package aula05b;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula05b2 {
    
    public static void main(String[] args) {
        
        String numeroStr = JOptionPane.showInputDialog(null,"Digite um número inteiro para Tabuada","Tabuada",3);
        int numero = Integer.parseInt(numeroStr);
        String msg = " ";
        
        for (int i = 1; i <= 10; i++){
            int total = i * numero;
            msg += numero + " X " +i+ " = " +total+ "\n";
        }
        
        JOptionPane.showMessageDialog(null, msg, "Tabuada",1);
    }
    
}