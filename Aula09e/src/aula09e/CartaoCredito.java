/**
 * Nessa classe vamos interpretar os metodos assinados na interface
 */
package aula09e;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class CartaoCredito implements Pagamento {
    
    String numeroCartao;
    double valor;
    double taxa;
    double total;
    
    public CartaoCredito(String numeroCartao,double valor){
        this.numeroCartao = numeroCartao;
        this.valor = valor;
    }
    
    @Override
    public void processarPagamento(double valor){
        this.taxa = valor * 0.03;
        this.total = valor + taxa;
        
    }
    @Override
    public void emitirRecibo(){
       JOptionPane.showMessageDialog(null,"Pagamento com cartão\n"
                + "Taxa: R$ "+String.format("%,.2f",taxa)+"\n"
                + "Valor da Compra: "+String.format("%,.2f",valor)+"\n"
                + "Total pago: "+String.format("%,.2f",total)); 
    }
    @Override
    public double aplicarDesconto(double percentual){
        this.total = total - (total * percentual / 100);
        return total;
    }
    
}
