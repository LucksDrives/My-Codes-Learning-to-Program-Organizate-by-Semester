/* 1) Construa um programa que leia uma frase e informe o número de palavras não repetidas
da frase. Use set para verificação. */

package Exercicio1;

import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;


public class Exercicio1 {
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
            Set< String > keys = frase.keySet(); // Obtem as classes
            
            System.out.printf ("\nQuantidade de palavras:%d\n\n", frase.size());
            
            // Classifica as classes
            TreeSet< String > orderedkeys = new TreeSet< String > ( keys );
            System.out.println ("Palavras Contidas na frase: \nPalavras\t Ocorrencias");

            // Gera a saida de cada chave da frase
            for ( String key : keys ) {
                System.out.printf ("%-10s%10s\n", key, frase.get( key ));
            }
        }
} 

