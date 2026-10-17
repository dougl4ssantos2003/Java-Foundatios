/**
 * nesse programa vamos estudar a estrutura de repetição for para receber as notas de um aluno e calcular a média desse aluno.
 * 
 */
package aula05b;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula05b4 {
    
    public static void main(String ars[]){
        
        String tit ="Senai";
        String nomeAluno = JOptionPane.showInputDialog(null,"Digite o nome do Aluno", tit,3);
        int numeroNotas = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantas nota serão lançadas:",tit,3));
        double somaNotas = 0;
        double media;
        
        for (int i = 1; i <= numeroNotas; i++){
            double nota = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a "+i+"° nota do aluno:",tit,3));
            somaNotas += nota;
                    
    } 
        
        media = somaNotas / numeroNotas;
        
        JOptionPane.showMessageDialog(null,"A média do Aluno: "+nomeAluno+" é "+String.format("%.1f",media),tit,1);
        
    }
    
}
