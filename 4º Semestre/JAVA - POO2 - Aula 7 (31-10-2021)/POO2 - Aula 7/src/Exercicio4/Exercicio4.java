/*
4) Considere o método a seguir EventoFecharJanela. Entretanto, há alguns erros, a
janela não está aparecendo, sendo que precisa aparecer, ter tamanho 300 x 100 e estar
localizado em 400 x 300. Implemente as linhas que faltam neste método.
 */
package Exercicio4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercicio4 {

    public void EventoFecharJanela() {

        JFrame frame = new JFrame();
        frame.setSize(300, 100);
        frame.setLocation(400, 300);
        frame.setTitle("Botão Teste");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        painel.add(botaoFecha);
        botaoFecha = new JButton("Fechar");
        botaoFecha.addActionListener(new FechaJanelaListener());
        janela = new JFrame("Exemplo Botão Fechar");
        janela.getContentPane().add(painel);
        -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        
    }
}
