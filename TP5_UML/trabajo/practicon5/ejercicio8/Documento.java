package trabajo.practicon5.ejercicio8;

public class Documento {
    private String titulo;
    private String contenido;
    
    private FirmaDigital firma;

    public Documento(String titulo, String contenido, String hash, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        
        
        this.firma = new FirmaDigital(hash, "15-11-2025", usuario);
    }

    public String getTitulo() {
        return titulo;
    }

    public FirmaDigital getFirma() {
        return firma;
    }
}