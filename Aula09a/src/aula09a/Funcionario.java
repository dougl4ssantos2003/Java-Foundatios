/**
 * Nessa classe vamos definir os atributos e metodos genéricos de um sistema de Funcionarios 
 */
package aula09a;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Funcionario {
    
    String nome;
    String cpf;
    double salario;
    
    public Funcionario(String nome,String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    public void aumentarSalario(double percentual){
        this.salario += this.salario * percentual/100;
    }
    
    public void mostrarDados(){
        String msg = "Nome: "+nome+"\n"
                + "CPF: "+cpf+"\n"
                + "Salario: R$: "+String.format("%,.2f",salario);
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
