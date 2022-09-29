package Ejs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ej7 {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton CALCULARButton;

    public Ej7() {
        CALCULARButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String msg;
                float A = Float.parseFloat(textField1.getText());
                float B = Float.parseFloat(textField2.getText());
                if (A>B){msg = A+" ES MAYOR QUE "+B;
                } else if (A<B) {msg = A+" ES MENOR QUE "+B;
                }else {msg = A+" ES IGUAL QUE "+B;}
                JOptionPane.showMessageDialog(null,msg);
            }
        });
    }

    public static void main(String[] Args) {
        Ventana Ej7 = new Ventana();
        JFrame ventana = Ej7.vtn("Ej 7");
        ventana.setContentPane(new Ej7().panel1);
        ventana.setVisible(true);
    }
}
