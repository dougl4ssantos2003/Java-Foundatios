/**
 * Nessa classe vamos criar o objeto do tipo produto 
 */
package aula09c;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula09c {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog(null,"Digite o nome do Produto");
        double preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço do Produto."));
        int estoque = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de produto no Estoque."));
        
        Produto prod1 = new Produto(nome, preco, estoque);
        
        String msg = "Produto: "+prod1.getNome()+"\n"
                + "Preço: R$ "+String.format("%,.2f", prod1.getPreco())+"\n"
                + "Quantidade Estoque: "+String.format("%,d", prod1.getEstoque());
        JOptionPane.showMessageDialog(null, msg);
        
    }
    
}
