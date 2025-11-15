package trabajo.practicon5.ejercicio11;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 11: Dependencia de Uso ---");

        Artista a1 = new Artista("Soda Stereo", "Rock");
        Cancion c1 = new Cancion("De Musica Ligera");
        
        c1.setArtista(a1);

        Reproductor rep = new Reproductor();
        
        rep.reproducir(c1);
    }
}