/**
 * Essa classe herda atributos e metodos da classe pessoa
 */
package aula08e;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas 
 */
public class Aluno extends Pessoa {
    
    String matricula;
    String curso;
    
    public Aluno(String nome, String cpf, String matricula, String curso){
        super(nome,cpf);
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public void inscreverTurma(){
        String msg = this.nome+" esta Inscrito no curso "+this.curso;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    @Override
    public void exibirDados(){
        super.exibirDados();
        String msg = "Matricula: "+this.matricula+"\n"
                + "Curso: "+this.curso;
        JOptionPane.showMessageDialog(null, msg);
    }
}
