package Ejs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class Ej41 {
    private JPanel panel1;
    private JButton agregarNumeroButton;
    private JTextField Dato;
    private JButton limpiarDatosButton;
    private JLabel Nums;
    private JLabel Mayor;
    ArrayList<Float> nums = new ArrayList<>();

    public Ej41() {
        agregarNumeroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float x = Float.parseFloat(Dato.getText());
                if (!nums.contains(x)){
                    nums.add(x);
                }
                float max = Collections.max(nums);
                Mayor.setText("Numero Mayor: "+max);
                Nums.setText("Datos: "+nums);
            }
        });
        limpiarDatosButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nums.clear();
                Mayor.setText("Numero Mayor:");
                Nums.setText("");
                Dato.setText("");
            }
        });
    }

    public static void main(String[] Args) {
        Ventana Ej41 = new Ventana();
        JFrame ventana = Ej41.vtn("Ej 41");
        ventana.setContentPane(new Ej41().panel1);
        ventana.setResizable(true);
        ventana.setVisible(true);
    }
}
