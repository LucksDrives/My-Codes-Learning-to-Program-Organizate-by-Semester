/*
3) Interfaces gráficas usando programação orientada a eventos é um modelo de
programação muito utilizado. Eventos são ações realizadas quando um usuário interage
com algum componente GUI. Considere um programa devidamente implementado e
configurado com eventos. Dê exemplos de eventos de ação.
 */

package Exercicio3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
  
/*Eventos de ação: notificam a ação de um componente específico*/
public class Exercicio3{
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setLocation(500, 200);
        frame.setTitle("Botão Teste");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        
        /*[Exemplo de Evento de Ação 1] Escrever em uma Label*/
        JLabel label1 = new JLabel();
        label1.setText("Escrever ");
        panel.add(label1);
        
        JTextField textField = new JTextField();
        textField.setColumns(10);         
        panel.add(textField);          
        
        /*[Exemplo de Evento de Ação 2] Clique de um Botão*/
        JButton button = new JButton();
        button.setText("Botão");
        panel.add(button);
        
        frame.setVisible(true);       
    }   
}

