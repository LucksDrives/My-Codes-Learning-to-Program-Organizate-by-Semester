/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio2;

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
