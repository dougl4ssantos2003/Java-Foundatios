/**
 * nessa classe vamos criar os objeos do tipo ContaBancaria
 */
package aula09b;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula09b {

    public static void main(String[] args) {
      
        ContaBancaria novaConta = new ContaBancaria("Jorge","12345-67");
        
        novaConta.motrarSaldo();
        novaConta.depositar(5000.00);
        novaConta.motrarSaldo();
        novaConta.sacar(3000.00);
        novaConta.motrarSaldo();
        novaConta.sacar(3000.00);
        novaConta.sacar(0);
        novaConta.motrarSaldo();
        
        novaConta.setTitular("Jorge da Silva");
        novaConta.motrarSaldo();
        
    }
    
}
