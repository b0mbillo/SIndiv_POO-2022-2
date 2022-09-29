package Ejs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ej40 {
    private JPanel panel1;
    private JButton agregarButton;
    private JButton calcularButton;
    private JButton limpiarButton;
    private JTextField Num;
    private JLabel Nums;
    private JLabel Cuadrados;
    private JLabel Cubos;
    private JLabel Raices;
    ArrayList<Float> nums = new ArrayList<>();
    ArrayList<Float> raices = new ArrayList<>();
    ArrayList<Float> cuadrados = new ArrayList<>();
    ArrayList<Float> cubos = new ArrayList<>();


    public Ej40() {

        agregarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float x = Float.parseFloat(Num.getText());
                if (!nums.contains(x)){
                    nums.add(x);
                }
                Nums.setText(String.valueOf(nums));
            }
        });


        calcularButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (double x: nums){
                    float r = (float)Math.sqrt(x);
                    float cua = (float)Math.pow(x,2);
                    float cub = (float)Math.pow(x,3);
                    if (!cuadrados.contains(cua)){
                        cuadrados.add(cua);
                    }
                    if (!cubos.contains(cub)){
                        cubos.add(cub);
                    }
                    if (!raices.contains(r)){
                        raices.add(r);
                    }
                }
                Cuadrados.setText(String.valueOf(cuadrados));
                Cubos.setText(String.valueOf(cubos));
                Raices.setText(String.valueOf(raices));
            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nums.clear();
                raices.clear();
                cuadrados.clear();
                cubos.clear();
                Nums.setText("");
                Num.setText("");
                Cuadrados.setText("");
                Cubos.setText("");
                Raices.setText("");
            }
        });
    }

    public static void main(String[] Args) {
        JFrame Ej40 = new Ventana().vtn("Ej 40",800,350);
        Ej40.setContentPane(new Ej40().panel1);
        Ej40.setVisible(true);
        Ej40.setResizable(true);
    }
}
