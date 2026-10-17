/**
 * Nesse programa vamos criar uma array apartir da solicitação do usuário 
 */
package aula05c;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula05c2 {
    
    public static void main (String [] args){
        
        
        int numeroNotas = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantas notas deseja lançar:","Escola Senai",3));
        double[] notas = new double[numeroNotas];
        
        for(int i =0; i<notas.length; i++){
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a "+(i+1)+"ª Nota: ", "Escola Senai",3));
            
        }
        double somaNotas=0;
        
        for(double nota : notas){
            JOptionPane.showMessageDialog(null,"Nota: "+nota);
            somaNotas += nota;
        }
        double media = somaNotas / notas.length;
        JOptionPane.showMessageDialog(null,"Média das Notas: "+media);
    }
    
}
