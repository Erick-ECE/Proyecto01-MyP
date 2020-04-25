import java.util.Hashtable;
import java.util.Map;


public class GraduarAlumno {
    Administrador admin = Administrador.getInstance();

    public static void graduar(Alumno a) {
        System.out.println("------------CERTIFICADO DE GRADUACIÓN----------------");
        System.out.println(a);
        Hashtable<String, Integer> calificaciones = a.getMateriacalif();

        for (Map.Entry<String, Integer> entry : calificaciones.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
        
            System.out.println ("Materia: " + key + " Calificacion: " + value);
        }
        System.out.println("Promedio: " + a.calculatePromedio());
        if(a.opcionTecnica != null){
            System.out.println("Opcion Tecnica: " + a.getOpcionTecnica());
        }

    }

}