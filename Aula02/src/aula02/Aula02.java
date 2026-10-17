/**
 * Nesse programa vamos exprorar os tipos primitivos do java.
*/
package aula02;

/**
 *
 * @author Aluno:Douglas
 */
public class Aula02 {

    
    public static void main(String[] args) {
        //Tipos primitivos 
        byte idade = 18;
        short ano = 2026;
        int populacaoDaCidade = 1_500_000;
        long distanciaEstrelas = 9_460_000_000_000L;
        
        //Tipos primitvos de ponto Flutuante(Decimais)
        float precoGasolina = 6.49f;
        double pi = 3.14159265359;
        double salario;
        salario = 5000.00;
        
        //Tipo Primitvo de caracter
        char nota = 'A';
        
        //Tipo Primitivo de dado Booleano
        
        boolean ehAluno = true;
        boolean ehFumante = false;
        
        // Tipo de objeto para texto 
        
        String nomeCompleto = "Gaspar Galego Neve";
        
        //Exibindo as variaveis 
        System.out.println("=".repeat(50));
        System.out.println("Idade: "+idade);
        System.out.println("Ano: "+ano);
        System.out.println("População de Guarulhos: "+populacaoDaCidade);
        System.out.println("Distancia das Estrelas: "+distanciaEstrelas+"km.");
        System.out.println("Preço da Gasolina: R$ "+precoGasolina);
        System.out.println("Salario: R$"+salario);
        System.out.println("Pi: "+pi);
        System.out.println("Nota do Aluno: "+nota);
        System.out.println("É aluno? " +(ehAluno ? "Sim" : "Não"));
        System.out.println("É fumante? " +(ehFumante ? "Sim" : "Não"));
        System.out.println("Nome Completo: "+nomeCompleto);
    }
    
}
