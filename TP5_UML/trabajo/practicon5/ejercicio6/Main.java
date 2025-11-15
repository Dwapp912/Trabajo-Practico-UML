package trabajo.practicon5.ejercicio6;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 6: Reserva ---");

        Cliente c1 = new Cliente("Laura Paez", "11-5555-4444");
        Mesa m1 = new Mesa(5, 4);

        Reserva r1 = new Reserva("20-11-2025", "21:00", m1);
        
        // Conectamos la Asociación Unidireccional
        r1.setCliente(c1);
        
        System.out.println("Reserva a nombre de (Asociacion): " + r1.getCliente().getNombre());
        System.out.println("En la Mesa N° (Agregacion): " + r1.getMesa().getNumero());
    }
}