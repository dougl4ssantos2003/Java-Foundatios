/**
 * Essa classe que é uma subclasse que herda os atributos e métodos da superclasse Animal
 */
package aula08d;

/**
 *
 * @author Aluno: Douglas
 */
public class Mamifero extends Animal{
    
String tipoPelo;

public Mamifero(String nome, int idade, String tipoPelo){
    super(nome,idade);
    this.tipoPelo = tipoPelo;
}
public void amamentar(){
    System.out.println(nome+" esta amamentando");
} 
    
}
