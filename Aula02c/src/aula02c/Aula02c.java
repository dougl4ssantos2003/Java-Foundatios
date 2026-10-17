/**
*Nesse programa estudaremos as conversões possivies de tipos de dados 
* e operações aritimétricas 
*/
package aula02c;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula02c {

    public static void main(String[] args) {
        
        //Conversão de numeros inteiros
        byte byteNumero = 18;
        short shortNumero = 1000;
        int intNumero = 100000;
        long longNumero = 200_000_000L;
        
        short numero = byteNumero; // Conversão implicita (um menor dentro de um maior)
        int numero1 = shortNumero;
        long numero2 = intNumero;
        
        //Conversão de numeros de Ponto fluente(decimais)
        float floatNumero = 123.456789f;
        double doubleNumero = 123.45678912345;
        
        double numero4 = floatNumero;
        float numero5 = (float)doubleNumero;//conversão explicita
        int numero6 = (int)doubleNumero;
                
        System.out.println("Double original: "+ doubleNumero);
        System.out.println("Double convertido para float: "+ numero5);
        System.out.println("Double convertido para int: "+ numero6);
        
        System.out.println("*".repeat(50));
        
        int valor1 = 10;
        int valor2 = 3;
        double valor3 = 15.5;
        double valor4 = 3.3;
        
        //Adição
        int soma1 = valor1 + valor2;
        double soma2 = valor3 + valor4;
        double soma3 = valor1 + valor3;
        
        System.out.println("Soma de "+valor1+" e "+valor2+" = "+soma1);
        System.out.println("Soma de "+valor3+" e "+valor4+" = "+soma2);
        System.out.println("Soma de "+valor1+" e "+valor3+" = "+soma3);
        
         System.out.println("*".repeat(50));
        //Subtração -
        //Multiplicação *
        // Divisão /
        int div1 = valor1 / valor2;
        double div2 = valor1 / valor2;
        double div3 = valor3 / valor4;
        
        System.out.println("Divisão de inteiros " +valor1+" por "+valor2+" = "+div1);
        System.out.println("Divisão de " +valor1+" por "+valor2+" = "+div2);
        System.out.println("Divisão de " +valor3+" por "+valor4+" = "+div3);
        
        //Modulo% (Resto da divisão)
        
        int resto1 = valor1 % valor2;
        double resto2 = valor3 % valor4;
        double resto3 = valor1 % valor4;
        
        System.out.println("=".repeat(50));
        System.out.println("Resto de "+valor1+" por "+valor2+ "é igual "+resto1);
        System.out.println("Resto de "+valor3+" por "+valor4+ "é igual "+resto2);
        System.out.println("Resto de "+valor1+" por "+valor4+ "é igual "+resto3);

        // concatenação de Strings
        
        System.out.println("=".repeat(50));
        System.out.println(1 + 3+" é o valor total");
        System.out.println("O total é "+ 1 + 3);
        
        
        System.out.println("=".repeat(50));
        double salario = 8764.59;
        String mensagem = "O salario do funcionario e R$ "+salario;
        System.out.println(mensagem);
        
    }
    
}
