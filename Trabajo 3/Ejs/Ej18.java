package Ejs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ej18 {
    private JTextField Cod;
    private JTextField Nom;
    private JTextField H;
    private JTextField Vh;
    private JTextField Ret;
    private JButton MOSTRARButton;
    private JLabel labelSalN;
    private JLabel labelSalB;
    private JLabel labelNom;
    private JLabel labelCod;
    private JPanel panel1;
    public Ej18() {
        MOSTRARButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String cod = Cod.getText();
                String nom = Nom.getText();
                int h = Integer.parseInt(H.getText());
                float vh = Float.parseFloat(Vh.getText());
                float ret = Float.parseFloat(Ret.getText());
                labelCod.setText("Codigo: " + cod);
                labelNom.setText("Nombres: " + nom);
                float bruto = vh*h;
                float r = bruto * ret/100;
                float neto = bruto-r;
                labelSalB.setText("Salario Bruto: " + bruto);
                labelSalN.setText("Salario Neto: " + neto);
            }
        });
    }

    public static void main(String[] Args) {
        JFrame Ej18 = new Ventana().vtn("Ej 18");
        Ej18.setContentPane(new Ej18().panel1);
        Ej18.setVisible(true);
        Ej18.setResizable(true);
    }
}
