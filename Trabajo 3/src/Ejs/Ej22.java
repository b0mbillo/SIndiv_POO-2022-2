package Ejs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ej22 {
    private JPanel panel1;
    private JTextField Nom;
    private JTextField Salario;
    private JTextField Horas;
    private JButton MOSTRARButton;
    private JLabel Nombre;
    private JLabel SalarioM;

    public Ej22() {
        MOSTRARButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nom = Nom.getText();
                float sal = Float.parseFloat(Salario.getText());
                int h = Integer.parseInt(Horas.getText());
                float salM = h*sal;
                Nombre.setText(nom);
                if(salM>450000){SalarioM.setText(String.valueOf(salM));}
            }
        });
    }

    public static void main(String[] Args) {
        Ventana Ej22 = new Ventana();
        JFrame ventana = Ej22.vtn("Ej 22");
        ventana.setContentPane(new Ej22().panel1);
        ventana.setVisible(true);
    }
}

