public class Ej5 {
    public static void main(String[] Args) {
        double suma = 0, x  = 20;
        int y = 40;
        suma += x;
        x += Math.pow(y, 2);
        suma += (x / y);
        System.out.print("El valor de la suma es: " + suma);
    }
}
