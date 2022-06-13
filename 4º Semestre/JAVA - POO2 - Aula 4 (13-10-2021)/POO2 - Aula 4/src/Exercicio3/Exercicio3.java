/* 3) Implementar um programa para adicionar nomes de bandas em uma List. Inserir 5 bandas. 
Após, remover a terceira banda. Mostrar em tela todos os passos.  */

package Exercicio3;

import java.util.ArrayList;

public class Exercicio3 {
    
    public static void main(String[] args) {
        
        ArrayList<String> listaBandas = new ArrayList();
      
        listaBandas.add("NX0");        
        listaBandas.add("Restart");
        listaBandas.add("Dejavu");
        listaBandas.add("Os Atuais");
        listaBandas.add("Xiquititas");
        
        int i;      
        
        System.out.printf("Percorrendo o ArrayList\n");
            int n = listaBandas.size();
            for (i=0; i<n; i++) {
        System.out.printf("Posição %d- %s\n", i, listaBandas.get(i));
            }
            
        listaBandas.remove(3);      
        
        System.out.printf("Percorrendo o ArrayList Atualizada\n");
            for (i=0; i<n; i++) {
        System.out.printf("Posição %d- %s\n", i, listaBandas.get(i));
            }
    }
}
