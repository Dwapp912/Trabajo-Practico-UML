package trabajo.practicon5.ejercicio5;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 5: Computadora ---");

        Propietario prop1 = new Propietario("Lucia Fernandez", "35.444.555");
        
  
        Computadora comp1 = new Computadora("HP", "HP-12345", "Asus B550M", "AMD B550");
        
       
        comp1.setPropietario(prop1);

        System.out.println("Computadora: " + comp1.getMarca());
        System.out.println("Propietario (Asociacion): " + comp1.getPropietario().getNombre());
        System.out.println("Placa Madre (Composicion): " + comp1.getPlacaMadre().getModelo());
        
        System.out.println("--- Probando Bidireccional ---");
        System.out.println("La PC de " + prop1.getNombre() + " es una " + prop1.getComputadora().getMarca());
    }
}