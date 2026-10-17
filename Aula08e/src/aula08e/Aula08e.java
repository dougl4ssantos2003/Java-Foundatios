/**
 *
 */
package aula08e;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula08e {

    public static void main(String[] args) {
        
       String nome = JOptionPane.showInputDialog(null,"Digite o nome da Pessoa.");
       String cpf = JOptionPane.showInputDialog(null,"Digite o CPF da pessoa.");
       
       Pessoa pessoaGenerica = new Pessoa(nome,cpf);
       pessoaGenerica.exibirDados();
       
       nome = JOptionPane.showInputDialog(null,"Digite o nome do Aluno.");
       cpf = JOptionPane.showInputDialog(null,"Digite o CPF do Aluno.");
       String matricula = JOptionPane.showInputDialog(null,"Digite a Matricula do Aluno");
       String curso = JOptionPane.showInputDialog(null,"Digite o Curso do Aluno");
       
       Aluno novoAluno = new Aluno(nome,cpf,matricula,curso);
       novoAluno.inscreverTurma();
       novoAluno.exibirDados();
       
       nome = JOptionPane.showInputDialog(null,"Digite o nome do Professor.");
       cpf = JOptionPane.showInputDialog(null,"Digite o CPF do Professor.");
       String disciplina = JOptionPane.showInputDialog(null,"Digite a Disciplina do Professor");
       double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o Salario do Professor"));
       
       Professor novoProfessor = new Professor(nome,cpf,disciplina,salario);
       novoProfessor.registrarDisciplina();
       novoProfessor.exibirDados();
    }
    
}
