/**
 * Nesse Programa vamos explorar os metodos sa classe String
*/
package aula02b;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula02b {

  
    public static void main(String[] args) {
       String nome = "Gaspar Galego Neve";
       String frase = "    o Java e PODEROSO ! ! !     ";
       String traco = "=";
       String curso = "JAVA";
       String vazia = "  ";
       
       // Conversão de Caixa(maiusculas e minusculas)
       System.out.println(traco.repeat(70));
       System.out.println("Nome Maíusculo: "+ nome.toUpperCase());
       System.out.println("Nome Minúsculo: "+ nome.toLowerCase());
       
       //Removendo Espaços em Branco
       System.out.println(traco.repeat(70));
       System.out.println("Remover Espaços anteriores e posteriores: "+ frase.trim());
       System.out.println("Frase sem Espaços(Metodo Strip)"+ frase.strip());
       
       //Verificando e comparando
       System.out.println("O curso é Java ? "+ curso.equals("Java"));
       System.out.println("O curso é Java Mesmo? "+ curso.equalsIgnoreCase("Java"));
       System.out.println("O curso contem 'JA':"+ curso.contains("JA"));
       System.out.println("A variavel esta vazia? "+ vazia.isEmpty());
       System.out.println("A variavel esta vazia (isBlank()"+ vazia.isBlank());
       
       //Busca, substituição e divisão
       System.out.println(traco.repeat(70));
       System.out.println("Numero de caracteres de 'nome': "+ nome.length());
       System.out.println("Numero de caracteres de 'frase': "+ frase.length());
       System.out.println("Numero de caracteres de 'frase' sem espaçoes em branco: "+ frase.trim().length());
       System.out.println("Letra na posição 7 do nome: "+ nome.charAt(7));
       System.out.println("Posição do 'pa' no Nome: "+ nome.indexOf("pa"));
       int posicao = nome.indexOf("Neve");
       String sobrenome = nome.substring(posicao);
       System.out.println("Sobrenome: "+ sobrenome);
       String nomeMeio = nome.substring(7, 13);
       System.out.println("Nome do meio: "+ nomeMeio);
       String nomeCorreto = nome.replace("Neve", "Blue");
       System.out.println("Nome correto: "+ nomeCorreto);
       String premio = "123,456,789.99";
       String xPremio = premio.replace(",","x");
       System.out.println("xPremiio: "+ xPremio);
       String vPremio = xPremio.replace(".", ",");
       System.out.println("vPremio: "+ vPremio);
       String zPremio = vPremio.replace("x", ".");
       System.out.println("zPremio: "+ zPremio);
       
    }
    
}
