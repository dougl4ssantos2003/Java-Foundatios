/**
 * 
 */
package aula05b;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula05bExercicio {
    
    public static void main(String args[]){
        
        String tit = "Estação Meteorológica";
        int numeroTemp = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número de temperaturas",tit,3));
        double somaTemp = 0;
        double media;
        
        for(int i = 1; i <= numeroTemp; i++){
            double temp = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a "+i+"ª Temperatura"));
            somaTemp += temp;
        }
        media = somaTemp/numeroTemp;
        
        JOptionPane.showMessageDialog(null,"A média das Temperaturas são "+String.format("%.2f", media));
      
        
    }
    
}
