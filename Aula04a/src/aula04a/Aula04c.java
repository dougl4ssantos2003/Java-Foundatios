/**
 * Nesse programa vamos estudar a estrutura de controle swich case encadeado
 */
package aula04a;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula04c {
    
    public static void main(String args[]){
        boolean isFeriado;
        int feriado = JOptionPane.showConfirmDialog(null,"Hoje é Feriado","Calendário",JOptionPane.YES_NO_OPTION,3);
       
        
        String diaSemana = JOptionPane.showInputDialog(null,"Digite o numero do dia da Semana","Calendário",3);
        
        switch(feriado){
                case 0:
                    JOptionPane.showMessageDialog(null,"Hoje é Feriado. E não trabalhamos","Calendário",1);
                    break;
                case 1:
                    switch(diaSemana){
                        case"1":
                            JOptionPane.showMessageDialog(null, "Hoje é Domingo. Dia de Descanso","Calendário",1);
                            break;
                        case"2":
                            JOptionPane.showMessageDialog(null, "Hoje é Segunda Feira. Dia de Trabalho Normal","Calendário",1);
                            break;
                        case"3":
                            JOptionPane.showMessageDialog(null, "Hoje é Terça Feira. Dia de Trabalho Normal","Calendário",1);
                            break;
                        case"4":
                            JOptionPane.showMessageDialog(null, "Hoje é Quarta Feira. Dia de Trabalho Normal","Calendário",1);
                            break;
                        case"5":
                            JOptionPane.showMessageDialog(null, "Hoje é Quinta Feira. Dia de Trabalho Normal","Calendário",1);
                            break;
                        case"6":
                            JOptionPane.showMessageDialog(null, "Hoje é Sexta Feira. Dia de Trabalho Normal","Calendário",1);
                            break;
                        case"7":
                            JOptionPane.showMessageDialog(null, "Hoje é Sabado. Dia de Trabalho 1/2 Periodo","Calendário",1);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "dia Invalido","Calendário",1);
                        
                    }
                    break;
                default: 
                    JOptionPane.showMessageDialog(null, "Voçe fechou a caixa sem escolher uma das opções","Calendário",1);
        }
    
    }
}
