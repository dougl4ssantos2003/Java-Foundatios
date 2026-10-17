/**
 * Nesse programa vamos estudar a classe ArrayList com numeros inteiros
 */
package aula06a;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula6a2 {

    public static void main(String args[]) {

        ArrayList<Integer> idades = new ArrayList<Integer>();
        String idadeStr;
        do {
            idadeStr = JOptionPane.showInputDialog(null, "Digite a idade do aluno ou 0 para encerrar.", "Sistema escola", 3);
            idades.add(Integer.parseInt(idadeStr));
        } while (!idadeStr.equals("0"));
        idades.remove(idades.indexOf(0));
        System.out.println(idades);
        int somaIdades = 0;
        for (int idade : idades) {
            somaIdades += idade;
            
        }
        int media = somaIdades/idades.size();
        JOptionPane.showMessageDialog(null, "As idades digitadas "+idades +"\n A média das idades  é "+media,"Sistema Escola",1);

    }

}
