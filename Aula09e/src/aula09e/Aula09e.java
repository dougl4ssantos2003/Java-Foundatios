/**
 * Nessa classe vamos executar o pagamento por cartão de credito
 */
package aula09e;

/**
 *
 * @author Aluno
 */
public class Aula09e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Pagamento pgto = new CartaoCredito("500-1234-5678-9990", 2500.00);
        
        pgto.processarPagamento(2500.00);
        pgto.emitirRecibo();
        
        
    }
    
}
