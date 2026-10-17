/**
 * Nessa classe vamos criar um modelo para os produtos em estoque 
 */
package aula08c;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Produto {
    
    String nome;
    double preco;
    int estoque;
    
    //Construtor
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.estoque = 0;
    }
    
    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
    
    public void inserirEstoque(int valor){
        if(valor>0){
            this.estoque += valor;
        }else {
            JOptionPane.showMessageDialog(null,"Valor Invalido para entrada no Estoque");
        }
    }
    public void retirarEstoque(int valor){
        if(valor>this.estoque){
            JOptionPane.showMessageDialog(null,"Saldo Insuficiente no estoque");
        }else if(valor <=0){
            JOptionPane.showMessageDialog(null,"Valor Invalido para retirada no Estoque");
        }else {
            this.estoque -= valor;
        }
    }
    public void imprimirDados(){
        String msg = "Nome do produto: "+this.nome+ "\n"
                + "Preço do produto: R$ "+String.format("%.2f",this.preco)+"\n"
                + "Quantidade em Estoque: "+ this.estoque;
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
