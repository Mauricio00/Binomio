/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binomio;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class CalculoBinomio extends JFrame implements ActionListener{
    JButton b1;
    JLabel l1;
    JTextField t1, t2;
    
    public CalculoBinomio(String t){
        super(t);
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(new JLabel("Numero 1:"));
        p1.add(t1 = new JTextField(10));
        p1.add(new JLabel("Numero 2:"));
        p1.add(t2 = new JTextField(10));
        
        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        p3.add(b1 = new JButton("Aceptar"));
        
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(BorderLayout.NORTH, p1);
        c.add(BorderLayout.CENTER, p3);
        b1.addActionListener(this);
    }
    
        public void actionPerformed (ActionEvent e) {
            try{
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = 0;
                JOptionPane.showMessageDialog(null,"(" + a + "^2) + " + "2" + "(" + a + ")(" + b + ") + (" + b + "^2) ");
                c = ((a)*(a))+((2)*(a)*(b))+((b)*(b));
                
                JOptionPane.showMessageDialog(null,"Resultado: " + c);
                
            }
            catch(Exception a){
                JOptionPane.showMessageDialog(null, "Error, no puedes hacer eso");
            }
        }

}
    

