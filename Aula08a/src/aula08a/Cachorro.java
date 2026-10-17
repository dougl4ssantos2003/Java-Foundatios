/**
 * Nessa classe vamos definir os atribustos e metodos para a criação  de objetos do tipo cachorro
 */
package aula08a;

/**
 *
 * @author Aluno: Douglas
 */
public class Cachorro {
    
    //Atributos
    String nome;
    String raca;
    int idade;
    
    //Métodos
    public void latir(){
        System.out.println(nome+" Esta Latindo!!!");
        System.out.println("Au! Au! Au!");
    }
    public void correr(){
        System.out.println(nome+" Esta Correndo...");
    }
    public void imprimir(){
        System.out.println("Nome do cachorro: "+nome);
        System.out.println("Raca do cachorro: "+raca);
        System.out.println("Idade do cachorro: "+idade);
    }
    
}
