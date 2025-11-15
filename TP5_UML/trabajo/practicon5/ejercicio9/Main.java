package trabajo.practicon5.ejercicio9;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 9: Cita Medica ---");

        Paciente pac1 = new Paciente("Diego Maradona", "OSDE");
        Profesional prof1 = new Profesional("Dr. House", "Diagnostico");
        
        CitaMedica c1 = new CitaMedica("25-11-2025", "10:30");
        
        // Conectamos las Asociaciones Unidireccionales
        c1.setPaciente(pac1);
        c1.setProfesional(prof1);
        
        System.out.println("Cita: " + c1.getFecha());
        System.out.println("Paciente: " + c1.getPaciente().getNombre());
        System.out.println("Profesional: " + c1.getProfesional().getNombre());
    }
}