/**
 * Nesse programa iremos estudar os metodos(Funções) sem parâmetros/argumentos e sem retorno
 */
package aula07b;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Aula07b {

    public void exibirBoasVindas() {

        System.out.println("-".repeat(40));
        System.out.println("***** Bem Vindo ao Sistema Senai *****");
        System.out.println("-".repeat(40));
    }

    public static void main(String[] args) {

        Aula07b msg = new Aula07b();
        msg.exibirBoasVindas();
        Scanner sc = new Scanner(System.in);
        double media = 0;
        double somaNota = 0;
        int i = 0;
        while (true) {
            System.out.print("Digite a Nota do aluno ou -1 para encerrar: 1");
            double nota = sc.nextDouble();
            if (nota == -1) {
                break;
            }
            i++;
            somaNota += nota;
        }
        media = somaNota / i;
        System.out.println("A media do Aluno foi " + media);
        Aula07b sair = new Aula07b();
        sair.prepararParaEncerrar();
    }

    public void prepararParaEncerrar() {

        System.out.println("=".repeat(40) + "\nIniciando Processo de Desligamento...\n"
                + "Salvando dados Pendentes...\n"
                + "Fechando Conexoes de Rede...\n"
                + "Aplicativo Pronto para ser encerrado.\n"
                + "=".repeat(40));

    }

}
