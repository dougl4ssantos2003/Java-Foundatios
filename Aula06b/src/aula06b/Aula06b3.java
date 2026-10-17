/**
 * Nesse programa vamos estudar o tratamento de exceção usando o try catch
 */
package aula06b;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula06b3 {

    public static void main(String args[]) {

        while (true) {
            try {
                String n1 = JOptionPane.showInputDialog(null, "Digite um número decimal: ");
                String n2 = JOptionPane.showInputDialog(null, "Digite outro número decimal: ");

                n1 = n1.replace(",", ".");
                n2 = n2.replace(",", ".");

                double numero1 = Double.parseDouble(n1);
                double numero2 = Double.parseDouble(n2);
                double divisao = numero1 / numero2;
                JOptionPane.showMessageDialog(null, "O Resultado da Divisão é " + String.format("%.2f", divisao));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas numeros.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e);
            }
        }
        System.out.println("Sistema executado com sucesso!!!");
    }
}
