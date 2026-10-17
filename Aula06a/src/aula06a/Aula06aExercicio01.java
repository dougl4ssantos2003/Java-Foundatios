/**
 *Utilizando Arraylist faça um programa que simule uma lista de tarefas . O programa deve permitir que o usuario adicione varias
 * tarefas. Para isso crie um loop que se encerra quando o usuário não quiser inserir novas tarefas . Ao final , exiba as tarefas adicionadas no console
 * do Netbeans (System.out.println). Para encerrar remova uma das tarefas simulando que a mesma foi executada , e exiba as tarefas.
 * Utilize JOpionPane para inserção de tarefa no console do netbeans.
 */
package aula06a;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula06aExercicio01 {

    public static void main(String Args[]) {

        ArrayList<String> tarefas = new ArrayList<String>();

        while (true) {
            String tarefaStr = JOptionPane.showInputDialog(null, "Digite uma tarefa: ", "Tarefas", 3);
            tarefas.add(tarefaStr);
            int resp = JOptionPane.showConfirmDialog(null, "Quer adicionar mais Tarefas", "Tarefas", JOptionPane.YES_NO_OPTION);
            if (resp == 1) {
                break;
            }
        }
        System.out.println("As tarefas: ");
        for (String tarefa : tarefas) {
            System.out.println(tarefa);
        }
        while (true) {
            String excluirTarefaStr = JOptionPane.showInputDialog(null, "Remova uma tarefa: ", "Tarefas", 3);
            tarefas.remove(excluirTarefaStr);
            int resp = JOptionPane.showConfirmDialog(null, "Quer remover mais Tarefas", "Tarefas", JOptionPane.YES_NO_OPTION);
            if (resp == 1) {
                break;
            }

        }
        System.out.println("As tarefas atualizadas: ");
        for (String tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }
}

