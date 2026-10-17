/**
 * Crie a classe Professor com os atributos diciplina(String) e salario(double). Essa classe deve extender(herdar) a classe Pessoa. 
Crie o construtor com a sobrecarga de Pessoa (super)
Crie o método registrarDisciplina() que exiba em um JOptionPane a mensagem: 'nome', está registrado na disciplina 'disciplina'
Crie o método exibirDados() sobrepondo o mesmo método da classe Pessoa (não esqueça do @Override)
Crie um professor na classe com o método principal
 */
package aula08e;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Professor extends Pessoa {
    
    String disciplina;
    double salario;
    
    public Professor (String nome,String cpf, String disciplina, double salario){
        super(nome,cpf);
        this.disciplina = disciplina;
        this.salario = salario;
    }
    public void registrarDisciplina(){
        JOptionPane.showMessageDialog(null,this.nome+" está registrado na Disciplina "+this.disciplina);
    }
    @Override
    public void exibirDados(){
        super.exibirDados();
        JOptionPane.showMessageDialog(null,"Disciplina: "+this.disciplina+"\n"
                + "Salario: R$"+this.salario);
    }
    
}
