/**
 * Faça um programa para receber o nome de um aluno e as notas que esse aluno recebeu ao longo do ano nesse programa você deve criar um loop
 * infinito pois não sabemos quantas notas o professor irá. a cada nota lançada exiba uma caixa perguntando ao professor se ele quer digitar outra nota
 * depois de todas notas lançadas , calcule a média e exiba com APROVADO ou REPROVADO. Para a aprovação media >= 50.
 */
package aula04b;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula04bExercicio {
    
    public static void main(String args[]){
        
        double media = 0;
        double contNota = 0;
        double nota;
        int cont = 0;
        
        String msg;
        String titulo = "Calculadora de Média.";
        
        while(true){
            String notaStr = JOptionPane.showInputDialog(null,"Digite a Nota do Aluno (0 a 100)",titulo,1);
            notaStr = notaStr.replace(",", ".");
            nota = Double.parseDouble(notaStr);  
            contNota += nota;
            cont++;
            
            int resp = JOptionPane.showConfirmDialog(null,"Você quer digitar outra Nota",titulo,JOptionPane.YES_NO_OPTION,3);
            if(resp == 1){
             break;   
            }
            
            
        }
        media = contNota / cont;
        
        if(media >=50){
            msg = "A Média do Aluno é "+String.format("%.1f", media)+" Conceito Final: Aprovado";
        }else{
            msg = "A Média do Aluno é "+String.format("%.1f", media)+" Conceito Final: Reprovado";
        }
        JOptionPane.showMessageDialog(null, msg,titulo,1);
        
    }
    
}
