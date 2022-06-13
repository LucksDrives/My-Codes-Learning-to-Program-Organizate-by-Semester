/*
1) Implementar os programas exemplos mostrados no material de aula (Fecha Janela,
Campo Limpar, Evento Mouse, Mouse Movimento, Evento Teclado e Text Field
Password). Identar e comentar.
 */
package Exercicio1;

import java.awt.event.*;
import javax.swing.*;
public class BotaoFechar
 {
JButton botaoFecha;
JFrame janela;
 private class FechaJanelaListener implements ActionListener
 {
 public void actionPerformed(ActionEvent e)
 {
 System.exit(0);
 }
}
 public BotaoFechar()
{
 botaoFecha = new JButton("Fechar");
 janela = new JFrame ("Exemplo Fechar");
 janela.setSize(300,100);
 janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JPanel painel = new JPanel();
 painel.add(botaoFecha);
 janela.getContentPane().add(painel);
 botaoFecha.addActionListener (new FechaJanelaListener());
 janela.setVisible(true);
}
public static void main(String[] args)
 {
 new BotaoFechar();
 }
}
