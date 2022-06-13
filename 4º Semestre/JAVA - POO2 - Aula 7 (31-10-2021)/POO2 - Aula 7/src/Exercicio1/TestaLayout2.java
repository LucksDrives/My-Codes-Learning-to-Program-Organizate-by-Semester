/*
1) Implementar os programas “TestaJanela4” (pg. 9) e “TestaLayout2” (pg. 11) usando
interfaces, com base no que foi mostrado em aula (“TestaJanela3”).
 */
package Exercicio1;

import javax.swing.*;
import java.awt.*;

public class TestaLayout2 extends JFrame {

    public TestaLayout2() {
        super("Título da janela");
        this.setBounds(50, 100, 200, 150);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel painel = new JPanel();
        BoxLayout box = new BoxLayout(painel, BoxLayout.Y_AXIS); // Determina que os componentes ficarão organizados em uma coluna vertical.painel.setLayout(box); // Define o tipo de layout (neste caso do tipo Box)
        painel.add(new JLabel("Clique no botão"));
        painel.add(new JButton("Botão"));
        painel.add(new JLabel("Digite o seu nome"));
        painel.add(new JTextField(10));
        this.setContentPane(painel);
        this.setVisible(true);
    }

    public static void main(String args[]) {
        TestaLayout2 t = new TestaLayout2();
    }
}
