/**
 * 
 */
package aula09exercio01;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula09exercio01 {

    public static void main(String[] args) {
        
    Aluno aluno1 = new Aluno("Gaspar",20,75,1.78);
    aluno1.calcularImc();
    aluno1.classificarImc();
    aluno1.mostrarDados();
    
    aluno1.setPeso(82);
    aluno1.mostrarDados();
    
    aluno1.setPeso(-10);
    aluno1.setIdade(-5);
    aluno1.setAltura(0);
    aluno1.setNome("");
    }  
    
    
}
