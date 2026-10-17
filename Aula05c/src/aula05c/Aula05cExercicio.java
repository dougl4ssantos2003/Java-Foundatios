/**
 * Crie um programa com uma array de 6 elementos utilizando 5 elementos.
 * Utilizando a biblioteca Random, sorteie 5 numeros entre 1 e 100 e
 * coloque cada numero em um elemento da array.
 * Imprima no console cada número da array
 */
package aula05c;

import java.util.Random;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula05cExercicio {

    public static void main(String args[]) {

        int[] numeros = new int[5];
        int temp;
        Random rd = new Random();
        
        for (int i=0; i <numeros.length; i++) {
            
            temp = rd.nextInt(100)+1;
            
            for (int n : numeros){
                if (temp==n){
                    temp = rd.nextInt(100)+1;
                }
            }
            numeros[i]= temp;
            System.out.println("Numero Sorteado:"+numeros[i]); 
        }
        
        
    }

}
