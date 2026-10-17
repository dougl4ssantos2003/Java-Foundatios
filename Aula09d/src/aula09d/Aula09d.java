/**
 * Nessa classe vamos estudar o polimorfismo por sobrecarga
 */
package aula09d;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula09d {
    
    public static int somar(int a, int b){
        int soma = a+b;
        return soma;
    }
    public static int somar(int a, int b, int c){
       int soma = a+b+c;
        return soma; 
    }
    public static double somar(double a, double b){
        double soma = a+b;
        return soma;
    }

    public static void main(String[] args) {
        
        int x = 10;
        int y = 20;
        int z = 30;
        double a = 15.55;
        double b = 28.32;
        
        System.out.println("Somando dois numeros inteiros");
        System.out.println("A soma de "+x+" e "+y+" = "+somar(x,y));
       
        System.out.println("Somando tres numeros inteiros");
        System.out.println("A soma de "+x+", "+y+" e "+z+" = "+somar(x,y,z));
        
        System.out.println("Somando dois numeros quebrados");
        System.out.println("A soma de "+a+" e "+b+" = "+String.format("%,.2f", somar(a,b)));
        
    }
    
}
