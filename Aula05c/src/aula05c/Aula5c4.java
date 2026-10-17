/**
 * Nesse programa vamos estudar uso  de array bidimensional
 */
package aula05c;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula5c4 {

    public static void main(String args[]) {

        String[][] turmasAlunos = { //Array com 6 linhas e duas colunas 
            {"Java", "Gaspar"},
            {"Excel", "Luiza"},
            {"Power BI", "Jorge"},
            {"C++", "Gaspar"},
            {"Html", "Bruce"},
            {"JavaScript", "Anabele"}
        };
        String msg = "";
        for (int i = 0; i < turmasAlunos.length; i++) {
            for (int j = 0; j < turmasAlunos[i].length; j++) {
                if (j == 0) {
                    msg += "Turma: " + turmasAlunos[i][j] + " - ";
                } else {
                    msg += "Aluno: " + turmasAlunos[i][j];
                }
            }
            System.out.println(msg);
            System.out.println("-".repeat(40));
            msg = "";
        }
    }

}
