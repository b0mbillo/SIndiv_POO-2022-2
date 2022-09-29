import java.util.Scanner;

class Fruta{ // como no está public no se puede usar en otros paquetes del proyecto
    int num = 420;
    String nom;

    void nombrar(){ // crear metodo (función) de la clase fruta
        Scanner teclado = new Scanner(System.in);
        nom = teclado.nextLine();
    }
}

public class Test {
    public static void main(String[] args) { //esto es lo que siempre va a ejecutar Test.java (la clase/programa) cuando se corre

       Fruta frt = new Fruta(); // instanciar un objeto de la clase fruta
       System.out.println(frt.num); // mostrar atributo num de la clase fruta
       if  (frt.nom == null){ // lo default va a ser null, ya que la clase solo tiene el atributo pero no valor
           System.out.println("no hay nombre");
        }

       frt.nombrar(); // usar metodo nombrar de la clase fruta
       System.out.println(frt.nom); // mostrar atributo nom del objeto frt

       Fruta frut = new Fruta();
       System.out.println(frut.nom); // la instancia frut no tiene valor en nom, ya que no ha usado el metodo nombrar
    }
}

// que es un modulo

/*
un proyecto es un directorio donde se construye lo necesario para tener un programa en java,
un paquete es un directorio dentro del proyecto
*/


/* modificadores de accesibilidad
public : visible en todo el proyecto
protected : visible solo en el paquete y por subclases (clases hijas)
no modifier (package) : visible solo en el paquete
private : visible solo por la clase (instancias de la clase)
*/
