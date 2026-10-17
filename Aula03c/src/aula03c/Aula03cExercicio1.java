/**
 *  Faça um trabalho que recebe os três lados de um triângulo e identifica qual o triângulo
 * de acordo com as regras abaixo:
 * Triângulo Equilatero: Possui 3 Lados iguais.
 * Triângulo Isóseles: Possui 2 Lados iguais.
 * Triângulo Escaleno: Possui 3 lados difrentes.
 * Importamte Verifique se a soma  de dois lados é menor que o terceiro lado
 * nesse caso não é possivel formar um triângulo. 
 * Utilizar JOptionPane para receber os lados e para mostrar o tipo de triângulo
 * 
 */
package aula03c;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula03cExercicio1 {
    
    public static void main(String args[]){
        //Entrada de Dados.
        String aStr = JOptionPane.showInputDialog(null,"Digite o tamanho do primeiro lado do Triângulo:","Qual Triângulo?",3);
        String bStr = JOptionPane.showInputDialog(null,"Digite o tamanho do segundo lado do Triângulo:","Qual Triângulo?",3);
        String cStr = JOptionPane.showInputDialog(null,"Digite o tamanho do terceiro lado do Triângulo:","Qual Triângulo?",3);
        //Converte String para Double.
        double ladoA = Double.parseDouble(aStr);
        double ladoB = Double.parseDouble(bStr);
        double ladoC = Double.parseDouble(cStr);
        //Logica para saber os tipos de Triângulo
        String msg = "";
        
        if(ladoA+ladoB<ladoC || ladoA+ladoC<ladoB || ladoB+ladoC<ladoA){
            msg = "Os valores informados não formam um triângulo.";
        }else if (ladoA == ladoB && ladoB == ladoC){
            msg = "Os lados do triângulo se referem a um Triângulo Equilatero";
        }else if(ladoA == ladoB || ladoB== ladoC){
            msg = "Os lados do triângulo se referem a um Triângulo Isóseles";
        }else if (!(ladoA == ladoB && ladoB == ladoC)){
            msg = "Os lados do triângulo se referem a um Triângulo Escaleno";
        }
        //saida de dados
        JOptionPane.showMessageDialog(null,msg,"Qual Triângulo?",1);
        
    }
    
}
