/**
 * Nessa classe vamos criar os atributos encapsulados para protegelos de acesso indevidos ou por descuido. Para acessar esse atributos 
 * utilizaremos os metodos get e set (Getters e Setters).
 */
package aula09b;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class ContaBancaria {
    
    private String titular;
    private String numeroConta;
    private double saldo;
    
    public ContaBancaria(String titular,String numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public void setTitular(String titular){
        if(!titular.isBlank()){
            this.titular = titular;
        }else {
            JOptionPane.showMessageDialog(null, "O titular está em Branco, Digite o titular!");
        }
    }
    public String getNumeroConta(){
        return this.numeroConta;
    }
    public void setNumeroConta(String numeroConta){
        if(!numeroConta.isBlank()){
            this.numeroConta = numeroConta;
        }else{
            JOptionPane.showMessageDialog(null, "O numero da conta está em Branco, Digite o numero da conta!");
        }
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void depositar(double valor){
        if(valor>0){
            this.saldo += valor;
        }else{
            JOptionPane.showMessageDialog(null, "Deposito invalido");
        }
    }
    public void sacar(double valor){
        if(valor>0 && valor <= saldo){
            this.saldo -= valor;
        }else if(valor > saldo){
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente para saque");
        }else {
            JOptionPane.showMessageDialog(null, "Saque Invalido");
        }
    }
    public void motrarSaldo(){
        String msg = "Titular: "+getTitular()+"\n"
                + "Saldo: R$ "+String.format("%,.2f", this.saldo);
        JOptionPane.showMessageDialog(null, msg);
    }
}
