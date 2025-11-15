package trabajo.practicon5.ejercicio12;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 12: Dependencia de Uso ---");

        Contribuyente c1 = new Contribuyente("Monotributista S.A.", "30-12345678-9");
        Impuesto i1 = new Impuesto(15000.0);
        
        i1.setContribuyente(c1);

        Calculadora calc = new Calculadora();
        
        calc.calcular(i1);
    }
}