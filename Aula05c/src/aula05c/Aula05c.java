/**
 * Nesse programa vamos estudar
 */
package aula05c;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula05c {

    
    public static void main(String[] args) {
       
        String[] alunos = new String[5];
        alunos[0] = "Gaspar";
        alunos[1] = "Anabela";
        alunos[2] = "Luiza";
        alunos[3] = "Jorge";
        alunos[4] = "Bruce";
        
        int idades[] = { 23,16,28,32,12};
        
        double[] alturas = { 1.70 , 1.45, 1.56, 1.78, 1.90};
        
        for (int i = 0; i < alunos.length; i++){
            System.out.print("Nome: "+alunos[i]);
            System.out.print(" - Idade: "+idades[i]);
            System.out.println(" - Altura: "+alturas[i]);
            System.out.println("Fim da Lista !!!");
            
        }
        
    }
    
}
