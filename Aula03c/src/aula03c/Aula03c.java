/**
 * nesse Programa vamos estudar a estrutura de decisão para vereficar valores do tipo String
*/
package aula03c;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno: Douglas
 */
public class Aula03c {

    
    public static void main(String[] args) {
        
        String unidade = JOptionPane.showInputDialog("Digite a unidade Senai desejada"+""
                + "\n na região de Guarulhos\n"
                + "(Centro,Dutra,Mariporâ ou Aruja)");
        String msg;
        if (unidade.equalsIgnoreCase("Centro")){
            msg = "Dirija-se ao Centro de Guarulhos";
        }else if(unidade.equalsIgnoreCase("Dutra")){
            msg = "Dirija-se a unidade Guarulhos Dutra";
        }else if (unidade.equalsIgnoreCase("Mariporã")){
            msg = "Dirija-se ao Centro de Mariporã";
        }else if(unidade.equalsIgnoreCase("Arujá")){
            msg = "Dirija-se a unidade Arujá";
        }else{
            msg = "Você não digitou uma unidade valida.";
        }
        
        JOptionPane.showMessageDialog(null, msg);
        
        
    }
    
}
