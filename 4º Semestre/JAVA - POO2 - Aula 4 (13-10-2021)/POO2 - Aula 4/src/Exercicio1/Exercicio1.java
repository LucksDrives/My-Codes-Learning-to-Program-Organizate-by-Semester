/* 1) Implementar uma estrutura para armazenamento de dados usando ArrayList. 
O programa deverá cadastrar 5 valores dentro de uma lista. Estes valores podem ser de qualquer tipo. 
Ao final mostrar os valores cadastrados. */

package Exercicio1;

import java.util.ArrayList;

public class Exercicio1 {

    public static void main(String[] args) {
        
       // Declarando e Instanciando uma Lista Telefonica de Clientes
        ArrayList<String> listaCliente = new ArrayList();

       // [ B ] usando o método add() para gravar 4 contatos na agenda
        listaCliente.add("José Asquidamini; 11 1111-1111");
        listaCliente.add("Marcos Busnello; 22 2222-2222");
        listaCliente.add("Leo Stronda; 33 3333-3333");
        listaCliente.add("Bred Pitt; 44 4444-4444");       
    }    
}
