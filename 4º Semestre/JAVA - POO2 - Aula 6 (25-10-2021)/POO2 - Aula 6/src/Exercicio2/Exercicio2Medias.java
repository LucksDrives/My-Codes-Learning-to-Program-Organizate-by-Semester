/*2) Construa um programa em Java, usando GUI, para notas de alunos, onde há 3 notas
com pesos diferentes: 3 (nota 1), 4 (nota 2) e 3 (nota 3). Mostre a média. */

package Exercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio2Medias{
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setLocation(500, 200);
        frame.setTitle("Notas dos Alunos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Exercicio2Medias media1 = new Exercicio2Medias();
        
        JOptionPane.showMessageDialog(null, "Cálcular Média das Notas");
        String nome = JOptionPane.showInputDialog("Informe o Nome do Aluno");
        
        JPanel panel = new JPanel();
        frame.add(panel);
        
        JLabel label = new JLabel();
        label.setText("<html><body>--------------------Nome do Aluno: " + nome + "--------------------<br></body></html>\");");
        panel.add(label);
        
        JLabel label1 = new JLabel();
        label1.setText("Nota 1 ");
        panel.add(label1);
        
        JTextField textField1 = new JTextField();
        textField1.setColumns(2);         
        panel.add(textField1);  
        
        JLabel label2 = new JLabel();
        label2.setText("Nota 2 ");
        panel.add(label2);

        JTextField textField2 = new JTextField();
        textField2.setColumns(2);
        panel.add(textField2);
        
        JLabel label3 = new JLabel();
        label3.setText("Nota 3 ");
        panel.add(label3);
 
        JTextField textField3 = new JTextField();
        textField3.setColumns(2);
        panel.add(textField3);
        
        JButton button = new JButton();
        button.setText("Calcular Média");
        panel.add(button);
        button.addActionListener(new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e) { 
            double nota1, nota2, nota3, media;
            nota1 = Double.parseDouble(textField1.getText());
            nota2 = Double.parseDouble(textField2.getText());
            nota3 = Double.parseDouble(textField3.getText());
        
            media = (nota1 + nota2 + nota3) / 3;
            JOptionPane.showMessageDialog(null, "Média do Aluno: " + media);
            System.out.println("\nMédia: " + media);
            }
        });
        
        frame.setVisible(true);       
    }   
}