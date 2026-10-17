/**
* Nesse programa vamos explorar o JOption
*/
package aula02f;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class Aula02f {

    
    public static void main(String[] args) {
        
        String tit = "Indici de massa corporal (IMC)";
        String nome = JOptionPane.showInputDialog(null,"Digite seu Nome",tit,3);
        String srtIdade = JOptionPane.showInputDialog(null,"Digite sua Idade",tit,3);
        String strPeso = JOptionPane.showInputDialog(null,"Digite seu Peso em quilos",tit,3);
        String strAltura = JOptionPane.showInputDialog(null,"Digite sua Altura em metros",tit,3);
        
        strAltura = strAltura.replace(",", ".");
        
        int idade = Integer.parseInt(srtIdade);
        double peso = Double.parseDouble(strPeso);
        double altura = Double.parseDouble(strAltura);
        
        double imc = peso / Math.pow(altura, 2);
        
        String msg = "Nome do usuario: "+ nome.toUpperCase()+"\n";
        msg = msg + " Idade: "+ idade +"\n";
        msg = msg + "Pesso: "+ peso + "Quilos\n";
        msg = msg + "Altura: "+ altura + "Metros\n";
        msg = msg+ "IMC: "+ String.format("%.1f", imc);
        
        JOptionPane.showMessageDialog(null, msg,tit,1);
        
    }
    
}
