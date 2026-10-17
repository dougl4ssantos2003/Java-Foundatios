/**
 * Nesse programa vamos estudar os metodos (funções) com parâmetros/argumentos e com retorno
 */
package aula07b;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula07b4 {

    public int calcularDobro(int numero) {
        return numero * 2;

    }

    public int calcularTriplo(int numero) {
        return numero * 3;

    }

    public int calcularQuadrado(int numero) {
        return numero * numero;
    }

    public int calcularCubo(int numero) {
        return numero * numero * numero;
    }

    public static void main(String args[]) {

        Object[] opcoes = {"Calcular Dobro", "Calcular Triplo", "Elevar ao Quadrado", "Elevar ao Cubo"};
        int resposta = JOptionPane.showOptionDialog(null, "Selecione a operação desejada:", "Calculadora Simples",
                JOptionPane.YES_NO_CANCEL_OPTION, 3, null, opcoes, opcoes[0]);
        String numeroStr = JOptionPane.showInputDialog("Digite um numero inteiro.");
        try{
        int numero = Integer.parseInt(numeroStr);
        int resultado = 0;
        Aula07b4 msg = new Aula07b4();
        switch (resposta) {
            case 0:
                resultado = msg.calcularDobro(numero);
                break;
            case 1:
                resultado = msg.calcularTriplo(numero);
                break;
            case 2:
                resultado = msg.calcularQuadrado(numero);
                break;
            case 3:
                resultado = msg.calcularCubo(numero);
                break;
            default: 
                JOptionPane.showMessageDialog(null, "Você fechou a janela sem escolher uma opção");
        }
        JOptionPane.showMessageDialog(null, "O resultado esperado é "+resultado);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Você não digitou um numero");
        }

    }

}
