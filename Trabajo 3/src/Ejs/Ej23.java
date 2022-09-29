package Ejs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ej23 {
    private JPanel panel1;
    private JTextField C;
    private JTextField B;
    private JTextField A;
    private JButton calcularButton;


    public Ej23() {
        calcularButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float a = Float.parseFloat(A.getText());
                float b = Float.parseFloat(B.getText());
                float c = Float.parseFloat(C.getText());
                double[] x = raices(a,b,c);
                JOptionPane.showMessageDialog(null,"Solucion 1 = "+ x[0]+ ", Solucion 2 = "+x[1]);
            }
        });
    }

    public static double[] raices(double a, double b, double c){
        double x = Math.pow(b,2)-4*c*a;
        double sol1 = (-b + Math.sqrt(x))/(2*a);
        double sol2 = (-b - Math.sqrt(x))/(2*a);
        return new double[]{sol1,sol2};
    }

    public static void main(String[] Args) {
        Ventana Ej23 = new Ventana();
        JFrame ventana = Ej23.vtn("Ej 23",300,350);
        ventana.setContentPane(new Ej23().panel1);
        ventana.setVisible(true);
    }
}
