public class Ej12 {
    public static void main(String[] args){
        int h = 48, pagaHora = 5000, salarioBruto;
        double salarioNeto, retencion;
        salarioBruto = h*pagaHora;
        retencion = salarioBruto*0.125;
        salarioNeto = salarioBruto-retencion;
        System.out.println("salario bruto = "+ salarioBruto);
        System.out.println("retencion de fuente = "+ (int)retencion); //se hace Narrowing Casting
        System.out.println("salario neto = "+ (int)salarioNeto);
    }
}
