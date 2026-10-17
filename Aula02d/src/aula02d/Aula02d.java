/**
 * Nesse programa estudaremos o uso do metodo String.format() 
 * para formatação de numeros em uma String.
 * 
*/
package aula02d;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula02d {

    public static void main(String[] args) {
        // % indicador de formato
        //%s, exibi String
        //%d, exibi Numeros Inteiros
        //%f, exibi numeros com casa decimais
        
        
        String produto = "Nootebook Dell";
        double preco = 2499.5566;
        int estoque = 15;
        double imposto = 0.18;
        
        System.out.println("=".repeat(50));
        String texto1 = String.format("O produto %s tem %d "
                +" unidades em estoque.",produto,estoque);
        System.out.println(texto1);
        
         texto1 = String.format("preço bruto: R$ %,.2f", preco);
        System.out.println(texto1);
        
        
    }
    
}
