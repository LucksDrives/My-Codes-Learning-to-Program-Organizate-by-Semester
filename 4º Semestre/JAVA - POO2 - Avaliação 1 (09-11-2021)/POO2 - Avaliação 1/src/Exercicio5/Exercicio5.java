/*
5) Desenvolver um programa para adicionar números em um List. Percorrer e exibir todos os
elementos. Adicionar outro número na décima posição. Realizar a ordenação dos valores
(crescente). Após, ordenar os valores de forma decrescente. Usar ArrayList e, após,
LinkedList.
 */
package Exercicio5;

import java.util.ArrayList;
import java.util.Comparator;

public class Exercicio5 {
    
    public static void main(int[] args) {
        
        //Construção da ArrayList
        ArrayList<Integer> listaNum = new ArrayList();
        
        //Valores da Lista
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
        
        int i; //Declaração de Auxiliar
        
        //Percorrer Valores da Lista e Ordenando os Mesmos
        System.out.printf("Percorrendo Todos Elementos do ArrayList\n");
            int n = listaNum.size();
            for (i=0; i<n; i++) {
        System.out.printf("Posição %d- %s\n", i, listaNum.get(i));
            }
        
        //Adicionando Outro Valor para a Posição 10
        listaNum.add(10, 20);
        listaNum.sort((Comparator<? super Integer>) listaNum);
    }
    
}