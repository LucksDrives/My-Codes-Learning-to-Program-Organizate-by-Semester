/*
1) Implementar os programas exemplos mostrados no material de aula (Fecha Janela,
Campo Limpar, Evento Mouse, Mouse Movimento, Evento Teclado e Text Field
Password). Identar e comentar.
 */
package Exercicio1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TesteTextField extends JFrame
implements ActionListener, FocusListener
{
private JTextField texto1, texto2, texto3;
private JPasswordField senha;
//Os carecteres digitados são cifrados
public TesteTextField(){
super("Exemplo - Eventos JTextField");
Container c = getContentPane();
c.setLayout(new FlowLayout());
texto1 = new JTextField(10);
c.add(texto1);
texto2 = new JTextField("Digite o texto");
c.add(texto2);
texto3 = new JTextField("TextField Não Editável", 20);
texto3.setEditable(false);
c.add(texto3);
senha = new JPasswordField("texto escondido");
c.add(senha);
texto1.addActionListener(this);
texto2.addActionListener(this);
texto2.addFocusListener(this);
texto3.addActionListener(this);
senha.addActionListener(this);
setSize(325,100);
show();
}
public void actionPerformed(ActionEvent e){
String s = "";
if(e.getSource() == texto1){
s = "Texto 1 : " + e.getActionCommand();
}
else if(e.getSource() == texto2){
 s = "Texto 2 : " + e.getActionCommand();
}
else if(e.getSource() == texto3){
 s = "Texto 3 : " + e.getActionCommand();
}
else if(e.getSource() == senha){
 JPasswordField pwd = (JPasswordField) e.getSource();
 s = "Senha : " + new String(pwd.getPassword());
}
JOptionPane.showMessageDialog(null,s);
}
public void focusGained(FocusEvent e){}
public void focusLost(FocusEvent e) {
String s = "";
if(e.getSource() == texto1) {
s = "Saiu do JTextField 1";
}
else if(e.getSource() == texto2) {
 s = "Saiu do JTextField 2";
}
else if(e.getSource() == texto3) {
 s = "Saiu do JTextField 3";
}
else if(e.getSource() == senha) {
 s = "Saiu do JPasswordField";
}
JOptionPane.showMessageDialog(null,s);
}
public static void main(String args[]) {
TesteTextField app = new TesteTextField();
app.addWindowListener(
new WindowAdapter(){
public void windowClosing(WindowEvent e){
System.exit(0);
}
}
);
}
}
