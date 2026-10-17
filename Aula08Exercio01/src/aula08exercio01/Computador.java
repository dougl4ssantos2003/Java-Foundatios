/**
 *
 */
package aula08exercio01;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Computador {

    //Atributos
    String marca;
    String modelo;
    int memoriaRam;

    //Construtores
    public Computador(String marca, String modelo, int memoriaRam) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
    }

    public Computador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = 8;
    }
    //Métodos
    public void mostrarInformacoes() {
        JOptionPane.showMessageDialog(null, "A marca do Computador é " + marca + "\n"
                + "O modelo do Computador é " + modelo + "\n"
                + "A quantidade de memoria RAM do computador é "+memoriaRam+" GB");
    }

}
