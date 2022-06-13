/*
1) Implementar os programas “TestaJanela4” (pg. 9) e “TestaLayout2” (pg. 11) usando
interfaces, com base no que foi mostrado em aula (“TestaJanela3”).
 */
package Exercicio1;

import javax.swing.*;

public class TestaJanela3 extends JFrame {

    public TestaJanela3() {
        super("Título da janela");
        this.setBounds(100, 100, 400, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel painelCustomizado = new JPanel(); // Adiciona um container JPanel
        painelCustomizado.add(new JLabel("Botão de exemplo:")); // Adiciona um rótulo
        painelCustomizado.add(new JButton("Botão de exemplo")); // Adiciona um botão
        this.setContentPane(painelCustomizado); // Define os componentes no container
        this.setVisible(true); // Mostra a janela JFrame
    }

    public static void main(String[] args) {
        TestaJanela3 t = new TestaJanela3();
    }
}
