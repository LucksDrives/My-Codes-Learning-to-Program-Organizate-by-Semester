/*
2) Criar um JLabel, um JTextField e um botão de evento que lê e mostra o que foi digitado.
 */

package Exercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio2{
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setLocation(500, 200);
        frame.setTitle("Botão Teste");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        
        JLabel label1 = new JLabel();
        label1.setText("Texto ");
        panel.add(label1);
        
        JTextField textField1 = new JTextField();
        textField1.setColumns(2);         
        panel.add(textField1);  

        JButton button = new JButton();
        button.setText("Exibir");
        panel.add(button);
        button.addActionListener(new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e) {
            String texto = textField1.getText();
            System.out.println("\nTexto: " + texto);
            }
        });
        
        frame.setVisible(true);       
    }   
}
