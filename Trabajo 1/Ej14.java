import java.util.Scanner; // clase que permite generar los inputs (leer por teclado)

public class Ej14 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float num = teclado.nextFloat();
        System.out.println("cuadrado de "+num+": "+ Math.pow(num,2));
        System.out.println("cubo de "+num+": "+ Math.pow(num,3));

    }
}

