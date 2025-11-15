package trabajo.practicon5.ejercicio7;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 7: Vehiculo ---");

        Motor m1 = new Motor("Nafta 1.6", "ABC-12345");
        Conductor c1 = new Conductor("Juan Perez", "B-1234");
        
        Vehiculo v1 = new Vehiculo("AA 123 BB", "Ford Focus", m1);
        
        v1.setConductor(c1);

        System.out.println("Vehiculo: " + v1.getModelo());
        System.out.println("Motor (Agregacion): " + v1.getMotor().getTipo());
        System.out.println("Conductor (Asociacion): " + v1.getConductor().getNombre());
        
        System.out.println("--- Probando Bidireccional ---");
        System.out.println("El vehiculo de " + c1.getNombre() + " es " + c1.getVehiculo().getPatente());
    }
}