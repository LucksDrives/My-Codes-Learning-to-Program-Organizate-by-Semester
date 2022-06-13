/*
1) Implementar os programas exemplos mostrados no material de aula (Fecha Janela,
Campo Limpar, Evento Mouse, Mouse Movimento, Evento Teclado e Text Field
Password). Identar e comentar.
 */
package Exercicio1;

import java.awt.event.*;
import javax.swing.*;
public class MouseMovimento
{
JButton botaoClique;
JFrame janela;
public MouseMovimento()
{
botaoClique = new JButton("Clique");
 janela = new JFrame ("Exemplo - Movimento do mouse");
 janela.setSize(200,100);
 janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JPanel painel = new JPanel();
 painel.add(botaoClique);
 janela.getContentPane().add(painel);
 botaoClique.addMouseListener (new Manipulador());
 janela.setVisible(true);
}
public static void main(String args[])
{
new MouseMovimento();
}
class Manipulador implements MouseListener
{
public void mouseClicked(MouseEvent e){
System.out.println("Clicou no botao.");
}
public void mouseEntered(MouseEvent e){
System.out.println("O mouse entrou no botao.");
}
public void mouseExited(MouseEvent e){
System.out.println("O Mouse saiu.");
}
public void mousePressed(MouseEvent e){}
public void mouseReleased(MouseEvent e){}
}
}

