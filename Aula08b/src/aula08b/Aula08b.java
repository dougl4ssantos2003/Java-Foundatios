/**
 * 
 */
package aula08b;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula08b {

    public static void main(String[] args) {
       
        Carro carro1 = new Carro("Fiat","Uno",2000);
        Carro carro2 = new Carro("Ford","EcoSport",2010);
        
        carro1.imprimirDados();
        System.out.println("=".repeat(40));
        carro2.imprimirDados();
        System.out.println("=".repeat(40));
        
        carro1.modelo = "Palio";
        carro1.imprimirDados();
    }
    
}
