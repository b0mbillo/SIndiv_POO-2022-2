package FigurasGeometricas;
import Ejs.Ventana;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaFiguras {
    private JTextField Radio;
    private JTextField BaseR;
    private JTextField AlturaR;
    private JTextField Lado;
    private JTextField BaseT;
    private JTextField AlturaT;
    private JButton calcularButton;
    private JPanel panel1;
    private JButton limpiarButton;

    public PruebaFiguras() {
        calcularButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Círculo figura1 = new Círculo(Integer.parseInt(Radio.getText()));
                Rectángulo figura2 = new Rectángulo(Integer.parseInt(BaseR.getText()),Integer.parseInt(AlturaR.getText()));
                Cuadrado figura3 = new Cuadrado(Integer.parseInt(Lado.getText()));
                TriánguloRectángulo figura4 = new TriánguloRectángulo(Integer.parseInt(BaseT.getText()),Integer.parseInt(AlturaT.getText()));

                JFrame ventanaRes = new Ventana().vtn("Resultados",600,350);
                Resultados Res = new Resultados();
                ventanaRes.setContentPane(Res.panel1);
                ventanaRes.setVisible(true);
                ventanaRes.setAlwaysOnTop(true);
                ventanaRes.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);


                Res.AreaC.setText("El área del círculo es = " + figura1.calcularArea());
                Res.PerimetroC.setText("El perímetro del círculo es = " + figura1.calcularPerímetro());

                Res.AreaR.setText("El área del rectángulo es = " + figura2.calcularArea());
                Res.PerimetroR.setText("El perímetro del rectángulo es = " + figura2.calcularPerímetro());

                Res.AreaCu.setText("El área del cuadrado es = " + figura3.calcularArea());
                Res.PerimetroCu.setText("El perímetro del cuadrado es = " + figura3.calcularPerímetro());

                Res.AreaT.setText("El área del triángulo es = " + figura4.calcularArea());
                Res.PerimetroT.setText("El perímetro del triángulo es = " + figura4.calcularPerímetro());
                Res.TipoT.setText(figura4.determinarTipoTriángulo());
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BaseR.setText("");
                BaseT.setText("");
                AlturaR.setText("");
                AlturaT.setText("");
                Lado.setText("");
                Radio.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame PruebaFiguras = new Ventana().vtn("Prueba Figuras",450,350);
        PruebaFiguras.setContentPane(new PruebaFiguras().panel1);
        PruebaFiguras.setVisible(true);
    }
}
