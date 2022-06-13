/*1) Construa os exemplos mostrados nos slides de aula (7, 19, 21, 23, 25 e 27). Dentro do
próprio código, explique-os. Faça um projeto novo para cada código. */

package Exercicio1;

//Exemplo 7

import javax.swing.JOptionPane;

public class Exercicio1Exemplo7 {
    
        public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Olá, Mundo!");
    
    JOptionPane.showConfirmDialog(null, "Deseja Continuar?",
        "Escolha", JOptionPane.YES_NO_CANCEL_OPTION);
    
    String nome = JOptionPane.showInputDialog("Informe o Nome");
    
    JOptionPane.showMessageDialog(null, "Nome = " + nome,
            "Saída", JOptionPane.PLAIN_MESSAGE);
    } 
}
