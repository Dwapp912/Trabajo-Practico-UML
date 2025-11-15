package trabajo.practicon5.ejercicio13;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 13: Dependencia de Creacion ---");

        Usuario u1 = new Usuario("Maximo Ponce", "max@mail.com");
        
        GeneradorQR gqr = new GeneradorQR();
        
        gqr.generar("https://github.com/Dwapp912", u1);
    }
}