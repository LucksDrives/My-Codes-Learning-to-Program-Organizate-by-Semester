/* 4) Desenvolver um programa para adicionar números em um List. Percorrer e exibir todos os elementos. Adicionar outro número na décima posição.
Realizar a ordenação dos valores (crescente). Após, ordenar os valores de forma decrescente. 
Usar ArrayList e, após, LinkedList. Descrever (dentro do código) a diferença de usar cada um (vantagens e limitações). */

package Exercicio4;

import java.util.ArrayList;
import java.util.Comparator;

public class Exercicio4 {
    
    public static void main(int[] args) {
        
        ArrayList<Integer> listaNum = new ArrayList();
      
        listaNum.add(1);        
        listaNum.add(2);
        listaNum.add(3);
        listaNum.add(4);
        listaNum.add(5);
        listaNum.add(6);
        listaNum.add(7);
        listaNum.add(8);
        listaNum.add(9);
        listaNum.add(10);
        
        int i;      
        
        System.out.printf("Percorrendo Todos Elementos do ArrayList\n");
            int n = listaNum.size();
            for (i=0; i<n; i++) {
        System.out.printf("Posição %d- %s\n", i, listaNum.get(i));
            }
            
        listaNum.add(10, 20);
        listaNum.sort((Comparator<? super Integer>) listaNum);
    }
    
}
