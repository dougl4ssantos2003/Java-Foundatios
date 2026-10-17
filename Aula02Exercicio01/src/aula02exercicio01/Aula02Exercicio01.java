/**
 *  Faça um progrma para calcular a media das notas de um aluno. O
 * nome do aluno é Jorge Blue. Ele tem 15 anos e realizou 4 provas 
 * e 3 trabalhos. Calculde a media somando as notas das provas e dos
 * trabalhos e dividindo por 7.
 * Imprima os dados do aluno conforme modelo abaixo:
 * O aluno (nome) tem (idade) anos.
 * Sua media no ano foi de (media). (obs a media deve ter apenas 
 * uma casa decimal)
 * 
 * notas: 6.3, 4.2, 9.5, 3.7, 9.9, 8.7 e 6.8.
 * cria uma variavel pra cada nota
 */
package aula02exercicio01;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula02Exercicio01 {


    public static void main(String[] args) {
        
        String nome = "Jorge Blue";
        int idade = 15;
        double n1 = 6.3, n2 = 4.2,n3 = 9.5, n4 = 3.7,n5 = 9.9,n6 = 8.7,n7 = 6.8;        
        double media = (n1+n2+n3+n4+n5+n6+n7)/7;
        
        System.out.println("O aluno " +nome+ " tem " +idade+ " anos.");
        System.out.printf("Sua media no ano foi de %,.1f.%n",media);
        
    }
    
}
