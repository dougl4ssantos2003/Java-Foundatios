/**
 * faça um programa que recebe a data de nascimento de uma pessoa no formato dd/mm/aaaa. 
 * essa data deve ser informada usando JOption
 * usando uma estrutura switch case verifique o mês de nascimento do usuário e exiba a data no formato
 * extenso (exemplo: 20 de junho de 2026). Use o JOptionPaine para exibir a data por extenso
 */
package aula04a;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Aula04aExercio1 {
    
    public  static void main(String args[]){
        
        String dataStr = JOptionPane.showInputDialog(null,"Digite sua data de nascimento: (dd/mm/aaaa)");
        int dataD = Integer.parseInt(dataStr.substring(0,2));
        int dataM = Integer.parseInt(dataStr.substring(3,5));
        int dataA = Integer.parseInt(dataStr.substring(6));
        
        switch(dataM){
            case 1: 
                JOptionPane.showMessageDialog(null, dataD+" de Janeiro de "+dataA,"Calendário Nascimento",2);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, dataD+" de Fevereiro de "+dataA,"Calendário Nascimento",2);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, dataD+" de Março de "+dataA,"Calendário Nascimento",2);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, dataD+" de Abril de "+dataA,"Calendário Nascimento",2);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, dataD+" de Maio de "+dataA,"Calendário Nascimento",2);
                break;
            case 6:
                JOptionPane.showMessageDialog(null, dataD+" de Junho de "+dataA,"Calendário Nascimento",2);
                break;
            case 7:
                JOptionPane.showMessageDialog(null, dataD+" de Julho de "+dataA,"Calendário Nascimento",2);
                break;
            case 8:
                JOptionPane.showMessageDialog(null, dataD+" de Agosto de "+dataA,"Calendário Nascimento",2);
                break;
            case 9:
                JOptionPane.showMessageDialog(null, dataD+" de Setembro de "+dataA,"Calendário Nascimento",2);
                break;
            case 10:
                JOptionPane.showMessageDialog(null, dataD+" de Outubro de "+dataA,"Calendário Nascimento",2);
                break;
            case 11:
                JOptionPane.showMessageDialog(null, dataD+" de Novembro de "+dataA,"Calendário Nascimento",2);
                break;
            case 12:    
                JOptionPane.showMessageDialog(null, dataD+" de Dezembro de "+dataA,"Calendário Nascimento",2);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Data Invalida", "Calendário Nascimento", 2);
            
    
        }
        
    }
    
}
