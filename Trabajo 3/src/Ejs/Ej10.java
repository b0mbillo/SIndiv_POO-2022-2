package Ejs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ej10 {
    private JPanel panel1;
    private JTextField Inscripcion;
    private JTextField Nombres;
    private JTextField Patrimonio;
    private JTextField Estrato;
    private JButton MOSTRARButton;
    private JLabel Num;
    private JLabel Nom;
    private JLabel Pago;

    public Ej10() {
        MOSTRARButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String n = Inscripcion.getText();
                String nom = Nombres.getText();
                float pt = Float.parseFloat(Patrimonio.getText());
                int est = Integer.parseInt(Estrato.getText());
                float pago = 50000;
                if (pt>2000000 && est>3){
                    double tp = pt*0.03;
                    pago += tp;
                }
                Num.setText(n);
                Nom.setText(nom);
                Pago.setText(String.valueOf(pago));
            }
        });
    }

    public static void main(String[] Args) {
        Ventana Ej10 = new Ventana();
        JFrame ventana = Ej10.vtn("Ej 10");
        ventana.setContentPane(new Ej10().panel1);
        ventana.setVisible(true);
    }
}
