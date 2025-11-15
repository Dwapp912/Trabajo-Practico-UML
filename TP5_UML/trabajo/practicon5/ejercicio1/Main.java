package trabajo.practicon5.ejercicio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 1: Pasaporte ---");
        
        Titular t1 = new Titular("Maximo Ponce", "30.123.456");
        
        Pasaporte p1 = new Pasaporte("ARG123456", "15-11-2025", "JPG");


        p1.setTitular(t1);

        System.out.println("Datos del Pasaporte: " + p1.getNumero());
        System.out.println("Nombre del Titular: " + p1.getTitular().getNombre());
        System.out.println("Foto (Composicion): " + p1.getFoto().getImagen());
        
        System.out.println("--- Probando Bidireccional ---");
        System.out.println("Datos del Titular: " + t1.getNombre());
        System.out.println("Pasaporte del Titular: " + t1.getPasaporte().getNumero());
    }
}