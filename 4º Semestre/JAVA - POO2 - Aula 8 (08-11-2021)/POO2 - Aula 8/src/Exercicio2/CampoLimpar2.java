/*
2) Escolha dois dos programas implementados no exercício 1 e, usando interfaces (com
base no que foi mostrado aula passada), os refaça.
 */
package Exercicio2;

import java.awt.event.*;
import javax.swing.*;
public class CampoLimpar2
 {
 JButton botaoLimpa;
JTextField campoTexto;
 JFrame janela;

private class LimpaCampoListener implements ActionListener
 {
 public void actionPerformed(ActionEvent e)
 {
 campoTexto.setText("");
//determina que um texto vazio deverá ser inserido ao clicar no botão
 }
 }
 public CampoLimpar2()
 {
 botaoLimpa = new JButton("Limpar");
 campoTexto = new JTextField(10);
 janela = new JFrame ("Exemplo Limpar");
 janela.setSize(300,100);
 janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
 JPanel painel = new JPanel();;
 painel.add (botaoLimpa); painel.add (campoTexto);
 janela.getContentPane().add(painel);
 botaoLimpa.addActionListener (new LimpaCampoListener());
 janela.setVisible(true);
 }
public static void main(String[] args) {
 new CampoLimpar2();
 }
}


