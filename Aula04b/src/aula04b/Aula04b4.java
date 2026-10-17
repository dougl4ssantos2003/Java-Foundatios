/**
 * Nesse programa vamos solicitar as notas de um aluno e imprimir seu conceito final 
 */
package aula04b;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno Douglas
 */
public class Aula04b4 {
    
    public static void main (String args[]){
        String title = "Escola Celso Charuri";
        String nomeAluno = JOptionPane.showInputDialog(null,"Digite o nome do aluno",title,3);
        String disciplina = JOptionPane.showInputDialog(null,"Digite a disciplina do aluno",title,3);
        
        int cont =1;
        double somaNotas =0;
        while(cont <=4){
            String notaStr = JOptionPane.showInputDialog(null,"Digite a nota do "+cont+"° Bimestre:",title,3);
            notaStr = notaStr.replace(",", ".");
            double nota = Double.parseDouble(notaStr);
            somaNotas += nota;
            cont++;
           
        }
        double media = somaNotas / 4;
        String conceitoFinal;
        if(media>=7){
            conceitoFinal ="Aprovado";
    }else if(media>=4 && media <7){
            conceitoFinal ="Recuperação";
    }else{
        conceitoFinal ="Reprovado";
    }
        JOptionPane.showMessageDialog(null,"A média do "+nomeAluno+"\n na Disciplina "+disciplina+" é "+String.format("%.1f",media)+"\n Conceito Final: "+conceitoFinal, title,1);
        
        
    }
    
}
