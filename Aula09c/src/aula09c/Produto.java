/**
 * Nessa classe vamos estudar o encapsulamento usando os metodos get e set
 */
package aula09c;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Produto {
    
    private String nome;
    private double preco;
    private int estoque;
    
    public Produto(String nome, double preco, int estoque){
        setNome(nome);
        setPreco(preco);
        setEstoque(estoque);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        if(!nome.isBlank()){
        this.nome = nome;
        }else{
            JOptionPane.showMessageDialog(null, "O nome do Produto está em Branco");
        }
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        if(preco>0){
        this.preco = preco;
        }else{
            JOptionPane.showMessageDialog(null, "O valor de Preço não pode ser Zero ou menor.");
        }
    }

    /**
     * @return the estoque
     */
    public int getEstoque() {
        return estoque;
    }

    /**
     * @param estoque the estoque to set
     */
    public void setEstoque(int estoque) {
        if(estoque>=0){
        this.estoque = estoque;
        }else{
            JOptionPane.showMessageDialog(null, "O valor de Estoque não pode ser Negativo.");
        }
    }
    
    public void vender(int quantidade){
        if(quantidade > 0 && quantidade <= estoque){
            estoque -= quantidade;
        }else if(quantidade <0){
            JOptionPane.showMessageDialog(null, "A quantidade não pode ser negativa.");
        }else{
            JOptionPane.showMessageDialog(null, "A quantidade não pode ser Zero.");
        }
    }
}
