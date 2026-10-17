/**
 * Nessa classe vamos criar os produtos da classe Notebook
 */
package aula09f;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula09f {

    public static void main(String[] args) {
        
        Produto prod1 = new Notebook("DELL Inspiron", "DELL", 4500, 10, 50);
        prod1.mostrarProduto();
        JOptionPane.showMessageDialog(null,"Preço final com desconto: "+ prod1.calcularPrecoFinal());
        
    }
    
}
