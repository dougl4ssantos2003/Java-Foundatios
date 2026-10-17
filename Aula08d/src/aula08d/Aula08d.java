/**
 * Nessa classe vamos instanciar os objetos das classes animal, mamifero e ave.
 */
package aula08d;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula08d {

    public static void main(String[] args) {
        
        Animal leao = new Animal("Simba",20);
        leao.exibirDados();
        leao.emitirSom("ROOAAARRR!!!");
        
        System.out.println("-".repeat(50));
        
        Mamifero cao = new Mamifero("Bruce",2,"Longo");
        cao.exibirDados();
        cao.amamentar();
        cao.emitirSom("Au! ".repeat(3));
         
        System.out.println("-".repeat(50));
        
        Ave papagaio = new Ave("Louro",50,"Curvo");
        papagaio.exibirDados();
        papagaio.voar();
        papagaio.emitirSom("Loro quer cafe!");
        
    }
    
}
