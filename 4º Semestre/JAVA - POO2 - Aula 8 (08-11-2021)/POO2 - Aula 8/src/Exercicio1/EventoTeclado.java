/*
1) Implementar os programas exemplos mostrados no material de aula (Fecha Janela,
Campo Limpar, Evento Mouse, Mouse Movimento, Evento Teclado e Text Field
Password). Identar e comentar.
 */
package Exercicio1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EventoTeclado extends JFrame implements KeyListener
{
private String linha1 = "", linha2 = "";
private JTextArea areaTexto;
public EventoTeclado()
{
super("Exemplo - Eventos de um Teclado");
areaTexto = new JTextArea(10,15);
areaTexto.setText("Pressione qualquer tecla do Teclado");
areaTexto.setEnabled(false);
addKeyListener(this);
setLayout(new FlowLayout());
add(areaTexto);
setSize(350,100);
show();
}
public void keyPressed(KeyEvent e) {
linha1 = "Tecla Pressionada: " + e.getKeyText(e.getKeyCode());
escreveLinha2(e);
}
public void keyReleased(KeyEvent e) {
linha1 = "Tecla Liberada: " + e.getKeyText(e.getKeyCode());
escreveLinha2(e);
}
public void keyTyped(KeyEvent e) {
linha1 = "Tecla Digitada: " + e.getKeyChar();
escreveLinha2(e);
}
private void escreveLinha2(KeyEvent e) {
if(e.isActionKey()){
linha2 = "Esta tecla é uma chave de ação";
}
else {
linha2 = "Esta tecla NÃO é uma chave de ação";
 }
areaTexto.setText(linha1 + "\n" + linha2);
}
public static void main(String args []){
EventoTeclado app = new EventoTeclado();
app.addWindowListener(
new WindowAdapter(){
public void windowClosing(WindowEvent e){
System.exit(0);
}
}
);
}
}
