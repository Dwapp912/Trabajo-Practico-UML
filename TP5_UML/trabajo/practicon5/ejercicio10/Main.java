package trabajo.practicon5.ejercicio10;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 10: Cuenta Bancaria ---");

        Titular t1 = new Titular("Matias Lopez", "31.222.333");
        
        CuentaBancaria c1 = new CuentaBancaria("00000123456789", 150000.0, "1234");
        
        c1.setTitular(t1);

        System.out.println("Cuenta: " + c1.getCbu());
        System.out.println("Titular (Asociacion): " + c1.getTitular().getNombre());
        System.out.println("Clave (Composicion): " + c1.getClave().getCodigo());
        
        System.out.println("--- Probando Bidireccional ---");
        System.out.println("La cuenta de " + t1.getNombre() + " es " + t1.getCuenta().getCbu());
    }
}