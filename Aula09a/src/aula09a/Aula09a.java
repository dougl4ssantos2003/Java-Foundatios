/**
 *  Nessa classevamos executar o sistema de Funcionarios criando os objetos
 */
package aula09a;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula09a {

    public static void main(String[] args) {
        
        Funcionario func1 = new Funcionario("Gaspar","123.456.789-10",6500.50);
        
        func1.mostrarDados();
        func1.aumentarSalario(13.5);
        func1.mostrarDados();
        
        Gerente geren1 = new Gerente("Paulo","456.123.789-11",16200.20,"TI");
        
        geren1.mostrarDados();
        geren1.aprovarFerias(func1.nome);
        geren1.aumentarSalario(10);
        geren1.mostrarDados();
        
    }
    
}
