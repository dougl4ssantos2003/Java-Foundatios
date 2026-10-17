/**
 * Nessa classe vamos definir os atribustos e metodos para a criação  de objetos do tipo Gato
 */
package aula08a;

/**
 *
 * @author Aluno: Douglas
 */
public class Gato {
    
    String nome;
    String raca;
    int idade;
    
    public void miar(){
        System.out.println(nome+" Esta Miandao");
        System.out.println("Miau! ".repeat(5));
        
    }
    public void beberLeite(){
        System.out.println(nome+" Esta bebendo Leite");
    }
    public void imprimir(){
        System.out.println("Nome do gato: "+nome);
        System.out.println("Raca do Gato: "+raca);
        System.out.println("Idade do Gato "+idade);
    }
}
