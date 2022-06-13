/* 2) Implementar um programa que receba cinco nomes. 
Os nomes devem ser armazenados em um ArrayList do tipo String. 
O programa deverá mostrar os nomes cadastrados em ordem inversa ao que foram cadastrados. */

package Exercicio2;

import java.util.ArrayList;

public class Exercicio2 {

    public static void main(String[] args) {
               
        ArrayList<String> listaNomes = new ArrayList();
      
        listaNomes.add("José Asquidamini");
        listaNomes.add("Marcos Busnello");
        listaNomes.add("Leo Stronda");
        listaNomes.add("Bred Pitt");
        
        int i;      
        
        System.out.printf("Percorrendo o ArrayList\n");
            int n = listaNomes.size();
            for (i=n; i<n; i--) {
                System.out.printf("Posição %d- %s\n", i, listaNomes.get(i));                
            }    
    } 
}
