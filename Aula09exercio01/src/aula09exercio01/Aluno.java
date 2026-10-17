/*
 */
package aula09exercio01;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aluno {

    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Aluno(String nome, int idade, double peso, double altura) {
        setNome(nome);
        setIdade(idade);
        setPeso(peso);
        setAltura(altura);
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
        if (!nome.isBlank()) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, "Digitar um nome é Obrigatorio");
        }
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        if (idade > 0 && idade <= 120) {
            this.idade = idade;
        } else {
            JOptionPane.showMessageDialog(null, "Digite uma idade valida");
        }
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            JOptionPane.showMessageDialog(null, "Digite um peso valido");
        }
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            JOptionPane.showMessageDialog(null, "Digite uma Altura valida");
        }
    }

    public double calcularImc() {
        double imc = peso / (altura * altura);
        return imc;
    }

    public String classificarImc() {
        String imcClasse;
        if (calcularImc() < 18.5) {
            imcClasse = "Abaixo do Peso";
        } else if (calcularImc() > 18.5 && calcularImc() <=24.9) {
            imcClasse = "Peso Normal";
        } else if (calcularImc() > 24.9 && calcularImc() <=29.9) {
            imcClasse = "Sobrepeso";
        } else {
            imcClasse = "Obsidade";
        }
        return imcClasse;
    }

    public void mostrarDados() {
        String msg = "=".repeat(50)+"\n"
                + "ALUNO\n"
                + "Nome: " + nome + "\n"
                + "Idade: " + idade + "\n"
                + "Peso: " + String.format("%,.2f", peso) + "\n"
                + "altura: " + String.format("%,.2f", altura) + "\n"
                + "IMC: " + String.format("%.2f", calcularImc()) + "\n"
                + "Classificação IMC: " + classificarImc()+"\n"
                + "=".repeat(50);
        JOptionPane.showMessageDialog(null, msg);
    }

}
