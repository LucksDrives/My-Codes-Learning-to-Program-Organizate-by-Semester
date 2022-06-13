/*1) Construa os exemplos mostrados nos slides de aula (7, 19, 21, 23, 25 e 27). Dentro do
próprio código, explique-os. Faça um projeto novo para cada código. */

package Exercicio1;

//Exemplo 23

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exercicio1Exemplo23 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setLocation(500, 200);
        frame.setTitle("Janela Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        
        JLabel label = new JLabel();
        label.setText("Nome: ");
        panel.add(label);
        
        frame.setVisible(true);
    }
}
