/**
 * Nessa classe vamos 
 */
package aula08c;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula08c {

    public static void main(String[] args) {
        
        Produto prod1 = new Produto("Java para iniciantes",125.55);
        Produto prod2 = new Produto("Caneta Esferografica",5.5,50);
        
        prod2.imprimirDados();
        
        prod1.imprimirDados();
        String valorStr = JOptionPane.showInputDialog(null,"Digite um valor para a entrada no Estoque");
        int valor = Integer.parseInt(valorStr);
        prod1.inserirEstoque(valor);
        prod1.imprimirDados();
        
        valorStr = JOptionPane.showInputDialog(null,"Digite um valor para retirada do Estoque");
        valor = Integer.parseInt(valorStr);
        prod1.retirarEstoque(valor);
        prod1.imprimirDados();
        
        String nome = JOptionPane.showInputDialog(null,"Digite o nome do produto:");
        String precoStr = JOptionPane.showInputDialog(null,"Digite o preço do produto:");
        String estoqueStr = JOptionPane.showInputDialog(null,"Digite a quantidade no Estoque ou 0 Para produto novo:");
        
        double preco = Double.parseDouble(precoStr);
        int estoque = Integer.parseInt(estoqueStr);
        Produto prod3 = new Produto(nome,preco,estoque);
        prod3.imprimirDados();
    }
    
}
