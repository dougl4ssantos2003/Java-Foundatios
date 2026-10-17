/**
 * Faça um programa com métodos com parâmetros e com retorno para calcular a área de três objetos geométricos.
 * Para calcular a area de um Triângulo: (Base*Altura)/2
 * Para calcular a area de um Retângulo: Base*Altura
 * Para calcular a area de um Circulo: PI * raio^2
 * crie um método para cada calculo e no método 'Main' solicite ao Usuário qual a are que ele deseja calcular, depois solicite os valores,
 * calcule a area e informe o resultado. Pode ser por JOptionPane,System ou Scanner.
 * Não esqueça de instanciar os objetos
 */
package aula07b;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Exercicio07 {

    public double calcularAreaTriangulo(double base, double altura) {
        double triangulo = (base * altura) / 2;
        return triangulo;
    }

    public double calcularAreaRetangulo(double base, double altura) {
        double retangulo = base * altura;
        return retangulo;
    }

    public double calcularAreaCirculo(double raio) {
        double circulo = Math.PI * (raio * raio);
        return circulo;
    }

    public static void main(String args[]) {
        while (true) {
            Object[] opcoes = {"Calcular Area do Triângulo", "Calcular Area do Retângulo", "Calcular Area do Circulo"};
            int resp = JOptionPane.showOptionDialog(null, "Selecione o Objeto escolhido para Calcular sua Area", "Calcular Area",
                    JOptionPane.YES_NO_CANCEL_OPTION, 3, null, opcoes, opcoes[0]);
            Exercicio07 resposta = new Exercicio07();
            if (resp == 0) {
                String alturaStr = JOptionPane.showInputDialog(null, "Digite a Altura do triângulo");
                String baseStr = JOptionPane.showInputDialog(null, "Digite a Base do triângulo");
                double altura = Double.parseDouble(alturaStr);
                double base = Double.parseDouble(baseStr);
                JOptionPane.showMessageDialog(null, "Area do Triângulo é " + String.format("%.2f", resposta.calcularAreaTriangulo(base, altura)));
            } else if (resp == 1) {
                String alturaStr = JOptionPane.showInputDialog(null, "Digite a Altura do retângulo");
                String baseStr = JOptionPane.showInputDialog(null, "Digite a Base do retângulo");
                double altura = Double.parseDouble(alturaStr);
                double base = Double.parseDouble(baseStr);
                JOptionPane.showMessageDialog(null, "Area do Retângulo é " + String.format("%.2f", resposta.calcularAreaRetangulo(base, altura)));
            } else if (resp == 2) {
                String raioStr = JOptionPane.showInputDialog(null, "Digite o Raio do Circulo");
                double raio = Double.parseDouble(raioStr);
                JOptionPane.showMessageDialog(null, "Area do circulo é " + String.format("%.2f", resposta.calcularAreaCirculo(raio)));
            } else {
                JOptionPane.showMessageDialog(null, "Você não Escolheu um Objeto");
            }
            int continua = JOptionPane.showConfirmDialog(null, "Quer continuar Calculando mais areas","Calculadora",JOptionPane.YES_NO_OPTION);
            if(continua==1){
                break;
            }
        }

    }

}
