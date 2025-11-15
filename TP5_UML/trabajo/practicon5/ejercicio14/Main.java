package trabajo.practicon5.ejercicio14;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 14: Dependencia de Creacion ---");

        Proyecto p1 = new Proyecto("Video-TP5", 5);
        
        EditorVideo editor = new EditorVideo();
        
        editor.exportar("mp4", p1);
    }
}