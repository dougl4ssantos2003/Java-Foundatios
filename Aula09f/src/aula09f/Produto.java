/**
 * Neesa classe vamos estudar os métodos abstratos usando o paradigma da abstração
 */
package aula09f;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public abstract class Produto {
    
    protected String nome;
    protected String fabricante;
    protected double preco;
    
    public Produto(String nome, String fabricante, double preco){
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
    }
    public void mostrarProduto(){
        String msg = "Produto: "+nome+"\n"
                + "Fabricante: "+fabricante+"\n"
                + "Preço: "+preco;
        JOptionPane.showMessageDialog(null,msg);
    }
    //método abstrato
    public abstract double calcularPrecoFinal(); 
    
}
