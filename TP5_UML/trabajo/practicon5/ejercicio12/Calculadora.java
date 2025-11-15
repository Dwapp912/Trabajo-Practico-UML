package trabajo.practicon5.ejercicio12;

public class Calculadora {

    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto de: " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto a pagar: " + impuesto.getMonto());
    }
}