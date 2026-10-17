/**
 * Essa classe herda os atributos e metodos da classe funcionario e implementa os seus atributos e metodos 
 */
package aula09a;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Gerente extends Funcionario{
    
    String departamento;
    
    public Gerente(String nome,String cpf,double salario,String departamento){
        super(nome,cpf,salario);
        this.departamento = departamento;
    }
    
    public void aprovarFerias(String funcionario){
        JOptionPane.showMessageDialog(null,nome+" Aprovou as férias de "+funcionario);
    }
    
    @Override
    public void mostrarDados(){
        String msg = "Nome: "+nome+"\n"
                + "CPF: "+cpf+"\n"
                + "Salario R$: "+String.format("%,.2f",salario)+"\n"
                + "Departamentos: "+departamento;
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
