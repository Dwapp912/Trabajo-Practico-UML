package trabajo.practicon5.ejercicio3;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 3: Libro ---");

        Autor autor1 = new Autor("J.R.R. Tolkien", "Sudafricano");
        Editorial ed1 = new Editorial("Minotauro", "Av. Rivadavia 123");

        Libro libro1 = new Libro("El Señor de los Anillos", "978-84-450-7179-3", ed1);
        
     
        libro1.setAutor(autor1);
        
        System.out.println("Libro: " + libro1.getTitulo());
        System.out.println("Autor (Asociacion): " + libro1.getAutor().getNombre());
        System.out.println("Editorial (Agregacion): " + libro1.getEditorial().getNombre());
        
        
    }
}