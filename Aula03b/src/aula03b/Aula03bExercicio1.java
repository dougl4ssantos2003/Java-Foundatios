/**
* Faça um Programa Para receber o nome do usuario seu peso em kg e sua altura em metros e calcule o imc desse usuario 
* usando a formula IMC = peso/ (altura * altura) crie uma estrutura de descisão para verificar a classificação o usuario 
* na tabela abaixo:
* Menor que 18,5               Abaixo do peso    
*Entre 18,5 e 24,9            Peso normal        
*Entre 25,0 e 29,9            Sobrepeso          
*Entre 30,0 e 34,9            Obesidade grau I   
*Entre 35,0 e 39,9            Obesidade grau II  
*Maior ou igual a 40,0      Obesidade grau III 
*/
package aula03b;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula03bExercicio1 {
    
    public static void main(String args[]){
        
        //Inserir Dados do Usuario
        String nomeUsu = JOptionPane.showInputDialog(null,"Digite o nome do Usuario:","Personal IMC",1);
        String pesoUso = JOptionPane.showInputDialog(null,"Digite o peso(Kg) do Usuario:","Personal IMC",1);
        String alturaUso = JOptionPane.showInputDialog(null,"Digite a altura(Metros) do Usuario:","Personal IMC",1);
        // tranformar os valores string em Double
        double peso = Double.parseDouble(pesoUso);
        double altura = Double.parseDouble(alturaUso);
        //calculo imc
        double imc = peso/ (altura * altura);
        //Logica para classificar o IMC do Usuário
        String msg;
        
        if (imc >=40){
            msg = "Obsidade Grau III";
        }else if(imc >=35){
            msg = "Obsidade Grau II";
        }else if(imc >=30){
            msg = "Obsidade Grau I";
        }else if(imc >=25){
            msg = "Sobre Peso";
        }else if(imc >=18.5){
            msg = "Normal";
        }else{
            msg = "Abaixo do Peso Normal";
        }    
        
        JOptionPane.showMessageDialog(null,"O nome do usuario é "+nomeUsu+"\n O IMC do Usuário : "+String.format("%.2f", imc)+"\n Classificação: "+msg,"Personal IMC ",1);
                
       
        
    }
    
}
