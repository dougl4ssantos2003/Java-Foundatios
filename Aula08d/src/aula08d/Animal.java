/**
 * Essa Classe será a classe Genérica do projeto ,ou seja, Super Classe ("Classe Mãe")
 */
package aula08d;

/**
 *
 * @author Aluno
 */
public class Animal {
    
    String nome;
    int idade;
    
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void emitirSom(String som){
        System.out.println(som);
    }
    public void exibirDados(){
        System.out.println("Nome"+ this.nome);
        System.out.println("Idade: "+this.idade);
    }
    
}
