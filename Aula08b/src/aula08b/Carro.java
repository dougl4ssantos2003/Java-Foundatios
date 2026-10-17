/**
 * 
 */
package aula08b;

/**
 *
 * @author Aluno
 */
public class Carro {
    
   String marca;
   String modelo;
   int ano;
   
   //Construtur
   public Carro(String marcaCarro,String modeloCarro,int anoCarro){
       marca = marcaCarro;
       modelo = modeloCarro;
       ano = anoCarro;
   }
   
   public void imprimirDados(){
       System.out.println("Marca do carro: "+marca);
       System.out.println("Modelo do Carro: "+modelo);
       System.out.println("Ano do Carro: "+ano);
   }
    
}
