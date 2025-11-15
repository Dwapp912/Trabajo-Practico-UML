package trabajo.practicon5.ejercicio8;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 8: Documento y Firma ---");

       
        Usuario u1 = new Usuario("Maximo Ponce", "max@mail.com");

        
        Documento d1 = new Documento("TP5", "Contenido...", "ABC123XYZ", u1);

        System.out.println("Documento: " + d1.getTitulo());
        
        
        System.out.println("Firmado por: " + d1.getFirma().getUsuario().getNombre());
    }
}