/**
 * 
 */
package aula07b;

/**
 *
 * @author Aluno
 */
public class Aula07b7 {
    
    private int proximoId = 1;
    
    public static final String NOME_APLICATIVO ="MyApp";
    public static final String VERSAO_APLICATIVO ="1.0.2 Beta"; 
    
    public int gerarNovoId(){
        return proximoId++;
        
    }
    
    public static void main(String args[]){
        Aula07b7 g1 = new Aula07b7();
        Aula07b7 g2 = new Aula07b7();
        
        System.out.println(g1.gerarNovoId());
        System.out.println(g2.gerarNovoId());
        System.out.println(g1.gerarNovoId());
        
        System.out.println("Nome do Aplicativo "+ NOME_APLICATIVO);
        System.out.println("Versao do Aplicativo "+ VERSAO_APLICATIVO);
    }
    
    
    
}
