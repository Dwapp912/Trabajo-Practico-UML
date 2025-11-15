package trabajo.practicon5.ejercicio13;

public class GeneradorQR {

   
    public void generar(String valor, Usuario usuario) {
        
       
        CodigoQR qr = new CodigoQR(valor);
        
      
        qr.setUsuario(usuario);

        System.out.println("Generando QR: " + qr.getValor());
        System.out.println("Para el usuario: " + qr.getUsuario().getNombre());
    }
}