/**
 * Jogo da advinhação
 * Nesse jogo o algoritimo vai sortear um numero entre um e dez o jogador terá três chances de acertar o numero sorteado 
 * cada palpite errado do jogador dispara uma dica informando se o palpite é maior ou menor que o número sorteado
 */
package aula04b;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula04b6 {
    
    public static void main (String args[]){
        
        Random rd = new Random();
        int numeroSecreto = rd.nextInt(100)+1;
        int tentativas;
        int tentativasRestantes =10;
        JOptionPane.showMessageDialog(null,"Você tem 10 tentativas para advinhar um numero entre 1 e 100","Jogo Advinhação",1);
        while(tentativasRestantes>0){
            tentativas = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite seu palpite: ","Jogo Advinhação",3));
            if(tentativas == numeroSecreto){
                JOptionPane.showMessageDialog(null, "PARABÉNS!!! Você scertou o número secreto.","Jogo Advinhação",1);
                break;
            }else if(tentativas > numeroSecreto){
                JOptionPane.showMessageDialog(null, "Seu Palpite é maior que o número secreto.","Jogo Advinhação",2);
            }else{
                JOptionPane.showMessageDialog(null, "Seu Palpite é menor que o número secreto.","Jogo Advinhação",2);

            }
            tentativasRestantes--;
            if(tentativasRestantes>0){
                JOptionPane.showMessageDialog(null, "Tente Novamente!","Jogo Advinhação",2);  
            }
            
        }
        if(tentativasRestantes==0){
            JOptionPane.showMessageDialog(null, "PERDEU!!! o número sorteado era:"+numeroSecreto,"Jogo Advinhação",0);
        
        } 
    }
    
}
