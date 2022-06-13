/*3) Crie uma interface gráfica para a inserção de dados de um cliente de uma loja. Dados:
Nome / Endereço / Telefone / Data Nascimento. Botões: Enviar / Cancelar. */

package Exercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio3Interface {    
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setLocation(500, 200);
        frame.setTitle("Notas dos Alunos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Exercicio3Interface interface1 = new Exercicio3Interface();
        
        JOptionPane.showMessageDialog(null, "Inserção de Dados do Cliente");
        
        JPanel panel = new JPanel();
        frame.add(panel);
        
        JLabel label = new JLabel();
        label.setText("<html><body>--------------------Dados do Cliente--------------------<br></body></html>\");");
        panel.add(label);
        
        JLabel label1 = new JLabel();
        label1.setText("Nome       ");
        panel.add(label1);
        
        JTextField textField1 = new JTextField();
        textField1.setColumns(15);         
        panel.add(textField1);
              
        JLabel label2 = new JLabel();
        label2.setText("Endereço  ");
        panel.add(label2);

        JTextField textField2 = new JTextField();
        textField2.setColumns(15);
        panel.add(textField2);
        
        JLabel label3 = new JLabel();
        label3.setText("Telefone   ");
        panel.add(label3);
 
        JTextField textField3 = new JTextField();
        textField3.setColumns(15);
        panel.add(textField3);
        
        JLabel label4 = new JLabel();
        label4.setText("DataNasc  ");
        panel.add(label4);
 
        JTextField textField4 = new JTextField();
        textField4.setColumns(15);
        panel.add(textField4);
        
        JButton button1 = new JButton();
        button1.setText("Enviar");
        panel.add(button1);
        button1.addActionListener(new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e) { 
            String nome = textField1.getText();
            String endereco = textField2.getText();
            String telefone = textField3.getText();
            String data_nasc = textField4.getText();
            System.out.println("Nome: " + nome);
            System.out.println("Endereço: " + endereco);
            System.out.println("Telefone: " + telefone);
            System.out.println("Data de Nascimento: " + data_nasc);
            }
        });
        
        JButton button2 = new JButton();
        button2.setText("Cancelar");
        panel.add(button2);
        button2.addActionListener(new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e) { 
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
       
        frame.setVisible(true);       
    }   
}
