package Ejs;

import javax.swing.*;
import java.awt.*;

public class Ventana {
    public JFrame vtn(String Titulo,int ancho,int alto){
        JFrame ventana = new JFrame(Titulo);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dim = new Dimension(ancho,alto);
        ventana.setSize(dim);
        ventana.setLocationRelativeTo(null);
        return ventana;
    }

    public JFrame vtn(String Titulo){ //sobrecarga
        JFrame ventana = new JFrame(Titulo);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dim = new Dimension(500,350);
        ventana.setSize(dim);
        ventana.setLocationRelativeTo(null);
        return ventana;
    }

}
