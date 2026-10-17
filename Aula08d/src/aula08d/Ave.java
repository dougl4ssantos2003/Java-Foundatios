/**
 * 
 */
package aula08d;

/**
 *
 * @author Aluno
 */
public class Ave extends Animal{
    
    String tipoBico;
    
    public Ave(String nome,int idade,String tipoBico){
        super(nome,idade);
        this.tipoBico = tipoBico;
    }
    public void voar(){
        System.out.println(nome+" esta voando");
    }
    
}
