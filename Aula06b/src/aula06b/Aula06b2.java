/**
 * Nesse programa vamos estudar o tratamento de exceção usando a estrutura try catch  
 */
package aula06b;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula06b2 {
    
    public static void main (String args[]){
        
        try{
        
        int numerador = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numerador da divisão"));
        
        int denominador = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Denominador da divisão"));
        
        int divisao = numerador / denominador;
        
        JOptionPane.showMessageDialog(null, "O Resultado da Divisão é "+divisao);
        }catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Não é Possivel dividir um número por zero.\n Digite um Numero diferente de zero");  
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite apenas numeros para a divisão");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro do sistema informe ao suporte o erro abaixo \n"+e);
        }  
    }
    
}
