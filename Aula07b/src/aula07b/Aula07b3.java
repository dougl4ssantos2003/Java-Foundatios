/**
 * nesse programa vamos estudar os metodos (funções) sem parâmetros/argumentos e com retorno 
 */
package aula07b;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Aula07b3 {
    
    public int gerarNumeroAleatorio(){
        
        Random rd = new Random();
        int numero = rd.nextInt(100)+1;
        return numero;
    }
    
    public static void main(String args[]){
        Aula07b3 gerador = new Aula07b3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros aleatorios deseja gerar: ");
        int numero = sc.nextInt();
        for(int i = 1; i<=numero; i++){
            System.out.print(gerador.gerarNumeroAleatorio()+" ");
        }
        System.out.println();
        System.out.println("Hora atual: "+gerador.gerarHoraAtual());
    }
    
    public String gerarHoraAtual(){
        
        LocalTime agora = LocalTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        String horaFormatada = agora.format(formato);
        return horaFormatada;
    }
}
