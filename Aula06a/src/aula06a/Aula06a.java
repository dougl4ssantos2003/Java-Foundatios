/**
 * Nesse Programa vamos estudar uso de Arraylist
 */
package aula06a;

import java.util.ArrayList;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula06a {

    public static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<String>();

        frutas.add("Maca");
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Laranja");

        System.out.println("Frutas que eu gosto " + frutas);
        System.out.println("A fruta que mais gosto é " + frutas.get(1));
        frutas.add(1, "Melao");
        System.out.println("Frutas que eu gosto " + frutas);
        System.out.println("A fruta que mais gosto é " + frutas.get(1));
        System.out.print("Frutas que eu gosto ");
        for (int i = 0; i < frutas.size(); i++) {
            if (i < frutas.size()-1) {
                System.out.print(frutas.get(i) + ", ");
            } else {
                System.out.print(frutas.get(i) + ".");
            }

        }
        System.out.println();
        frutas.add("melancia");
        frutas.set(0,"Morango");
        
        System.out.println("Frutas Alteradas "+frutas);
        
        int posicao = frutas.indexOf("Banana");
                System.out.println("A Banana esta na posicao: "+ posicao);
                frutas.set(posicao, "Uva");
                System.out.println("Frutas sem a Banana "+frutas);
                frutas.remove(4);
                System.out.println("Frutas sem Laranja "+frutas);
                frutas.remove("Melao");
                System.out.println("Frutas sem melao "+frutas);
                System.out.println(frutas.contains("melancia"));
                
                if(frutas.contains("melancia")){
                    System.out.println("Contem Melancia"); 
                }else{
                    System.out.println("Não contem Melancia");
                }
                
                frutas.clear();
                
                System.out.println("Frutas " +frutas);
                
    }

}
