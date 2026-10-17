/**
 * Nessa classe vamos definir os atributos e metodos genéricos de uma pessoa
 */
package aula08e;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Pessoa {
    
    String nome;
    String cpf;
    
    public Pessoa(String nome,String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public void exibirDados(){
        String msg = "Nome: "+this.nome+"\n"
                + "CPF: "+this.cpf;
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
