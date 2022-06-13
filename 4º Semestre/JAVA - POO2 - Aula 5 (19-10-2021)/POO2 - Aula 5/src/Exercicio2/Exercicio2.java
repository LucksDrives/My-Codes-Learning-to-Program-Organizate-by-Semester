/* 2) Implemente um programa que leia uma frase com nomes de cores e informe o número de
ocorrências de cada cor nesta frase. Use map. */ 

package Exercicio2;

import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;


public class Exercicio2 {
    private Map< String , Integer> frase;
    private Scanner leitura;

// ------------------------------------------------------------------- //
        // criar uma Frase
        public void criarFrase(){
            frase = new HashMap < String, Integer >();
            leitura = new Scanner( System.in );
            System.out.println("Escreva a frase: ");
            String input= leitura.nextLine();

            // Cria StringTokenizer para a frase de entrada
            StringTokenizer quebraFrase = new StringTokenizer( input );

            //Processamento de texto de entrada
            while (quebraFrase.hasMoreTokens()){
		String palavra = quebraFrase.nextToken().toLowerCase();

		// Se a frase tiver a palavra
		if (frase.containsKey( palavra )){
                    int contador = frase.get( palavra );
                    frase.put( palavra, contador+1);
		}
                else{
                    frase.put( palavra, 1 );
                }    
	    }
	}

// ------------------------------------------------------------------- //        
	// Mostrar conteudo da Frase
	public void mostrarFrase(){
            Set< String > cores = new HashSet<>(); // Obtem as classes
            
            cores.add("azul");
            cores.add("amarelo");
            cores.add("vermelho");
            cores.add("preto");
            cores.add("branco");
            cores.add("roxo");
            cores.add("cinza");
            cores.add("laranja");
            cores.add("verde");
            cores.add("marrom");
            cores.add("rosa");
            
            System.out.printf ("\nQuantidade de palavras:%d\n\n", frase.size());
            
            // Classifica as classes
            TreeSet< String > orderedCores = new TreeSet< String > ( cores );
            System.out.println ("Cores Contidas na frase: \nPalavras\tOcorrencias");

            // Gera a saida de cada chave da frase
            for ( String key : cores ) {
                System.out.printf ("%-10s%10s\n", key, frase.get( key ));
            }            
        }
} 


