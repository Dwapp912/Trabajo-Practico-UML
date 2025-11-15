package trabajo.practicon5.ejercicio14;

public class EditorVideo {

    public void exportar(String formato, Proyecto proyecto) {
        
        
        Render r1 = new Render(formato);
        
      
        r1.setProyecto(proyecto);

        System.out.println("Exportando video...");
        System.out.println("Proyecto: " + r1.getProyecto().getNombre());
        System.out.println("Formato: " + r1.getFormato());
    }
}