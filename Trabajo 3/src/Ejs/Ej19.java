package Ejs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ej19 {
    private JTextField textField1;
    private JButton CALCULARButton;
    private JLabel areaLabel;
    private JLabel alturaLabel;
    private JLabel perimetroLabel;
    private JPanel panel1;

    public Ej19() {
        CALCULARButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float lado = Float.parseFloat(textField1.getText());

                double Altura = Math.sqrt(3)*lado / 2;
                alturaLabel.setText(String.valueOf((float)Altura));
                float Perimetro = lado * 3;
                perimetroLabel.setText(String.valueOf((Perimetro)));
                double Area = lado*Altura/2;
                areaLabel.setText(String.valueOf(Area));
            }
        });
    }

    public static void main(String[] args){
        JFrame Ej19 = new Ventana().vtn("Ej 19",500,200);
        Ej19.setContentPane(new Ej19().panel1);
        Ej19.setVisible(true);
    }
}
