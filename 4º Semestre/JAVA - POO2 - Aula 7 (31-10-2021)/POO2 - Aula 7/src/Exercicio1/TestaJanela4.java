/*
1) Implementar os programas “TestaJanela4” (pg. 9) e “TestaLayout2” (pg. 11) usando
interfaces, com base no que foi mostrado em aula (“TestaJanela3”).
 */
package Exercicio1;

import javax.swing.*;

public class TestaJanela4 extends JFrame {

    public TestaJanela4() {
        super("Título da janela");
        this.setBounds(100, 100, 400, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel painelCustomizado = new JPanel();
        for (int i = 1; i <= 8; i++) {
            painelCustomizado.add(new JButton("Aperte " + i)); // Adiciona um botão
        }
        this.setContentPane(painelCustomizado);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        TestaJanela4 t = new TestaJanela4();
    }
}
