package trabajo.practicon5.ejercicio2;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 2: Celular ---");

        Bateria b1 = new Bateria("Samsung-A50", 4000);
        
        Usuario u1 = new Usuario("Carlos Ruiz", "32.111.222");

        Celular c1 = new Celular("123456789", "Samsung", "A50", b1);
        
        c1.setUsuario(u1);

        System.out.println("Usuario: " + c1.getUsuario().getNombre());
        System.out.println("Bateria (Agregacion): " + c1.getBateria().getModelo());
        
        System.out.println("--- Probando Bidireccional ---");
        System.out.println("Celular del usuario: " + u1.getCelular().getModelo());
    }
}