/*
 * Nesse Programa vammos rever o metodo substring da classe string para extrair partes de uma string
 */
package aula04a;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula04d {
    
    public static void main (String args[]){
        
        String texto = "Celso Charuri";
        
        System.out.println("Segundo nome do texto: "+texto.substring(6));
        System.out.println("O primeiro no do texto: "+texto.substring(0,5));
        
    }
    
}
