package trabajo.practicon5.ejercicio4;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 4: Tarjeta de Credito ---");

        Banco banco1 = new Banco("Banco Nacion", "30-5000123-1");
        Cliente cliente1 = new Cliente("Ana Garcia", "28.555.666");

        TarjetaDeCredito tdc1 = new TarjetaDeCredito("4500-1111-2222-3333", "12/28", banco1);
        
 
        tdc1.setCliente(cliente1);

        System.out.println("Tarjeta: " + tdc1.getNumero());
        System.out.println("Cliente (Asociacion): " + tdc1.getCliente().getNombre());
        System.out.println("Banco (Agregacion): " + tdc1.getBanco().getNombre());
        
        System.out.println("--- Probando Bidireccional ---");
        System.out.println("La tarjeta de " + cliente1.getNombre() + " es " + cliente1.getTarjeta().getNumero());
    }
}