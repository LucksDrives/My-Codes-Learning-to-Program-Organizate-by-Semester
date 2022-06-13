/*
1) Implementar os programas exemplos mostrados no material de aula (Fecha Janela,
Campo Limpar, Evento Mouse, Mouse Movimento, Evento Teclado e Text Field
Password). Identar e comentar.
 */
package Exercicio1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EventoMouse extends JFrame implements MouseListener,
MouseMotionListener
{
private JLabel texto;
public EventoMouse()
{
super("Exemplo - Eventos com mouse");
texto = new JLabel();
setLayout(new FlowLayout());
add(texto);
addMouseListener(this);
//Este componente (Janela) passa a ser um listener do mouse
addMouseMotionListener(this);
setSize(275,100);
show();
}
public void mouseClicked(MouseEvent e) {
texto.setText("Clicado em [" + e.getX() + "," + e.getY() + "]");
}
public void mousePressed(MouseEvent e) {
texto.setText("Pressionado em [" + e.getX() + "," + e.getY() + "]");
}
public void mouseReleased(MouseEvent e) {
texto.setText("Liberado em [" + e.getX() + "," + e.getY() + "]");
}
public void mouseEntered(MouseEvent e) {
texto.setText("Mouse na janela");
}
public void mouseExited(MouseEvent e) {
texto.setText("Mouse Fora da Janela");
}
public void mouseDragged(MouseEvent e) {
texto.setText("Arrastado em [" + e.getX() + "," + e.getY() + "]");
}
public void mouseMoved(MouseEvent e) {
texto.setText("Movido para [" + e.getX() + "," + e.getY() + "]");
}
public static void main (String args [])
{
EventoMouse app = new EventoMouse();
app.addWindowListener(
new WindowAdapter(){
public void windowClosing(WindowEvent e){
System.exit(0);
}
}
);
}
}

