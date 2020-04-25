import java.util.Hashtable;

/**
 * Del Caso de Uso "Inscrie Alumno"
 * registra un nuevo alumno en las listas correspondientes
 */
public class InscribeAlumno {
    static Administrador admin = Administrador.getInstance();

    public static void inscribir(Alumno a){
        int area= a.area;
        char grupo = a.grupo;

        admin.alumnosTotales.put(a.id, a); // agrega a la lista general
        
        //Para agregar a la lista por area
        switch (area) {
            case 1: // fisico matematicas
                admin.fisicoMatematicas.add(a); 
                
                // agrega materias correspondientes al alumno
                Hashtable<String,Integer> materias = new Hashtable<>();
                materias.put("Fisica", 0); // calificación inicial 0
                materias.put("Matematicas", 0); // calificación inicial 0
                
                a.setMateriacalif(materias);
            
                break;
            
            case 2: // biologicas y de la salud
                admin.biologicasYsalud.add(a);
                 
                // agrega materias correspondientes al alumno
                 Hashtable<String,Integer> materias1 = new Hashtable<>();
                 materias1.put("Biologia", 0); // calificación inicial 0
                 materias1.put("Quimica", 0); // calificación inicial 0
                 
                 a.setMateriacalif(materias1);
                break;
                
            case 3: // ciencias sociales
                admin.cienciasSociales.add(a);
                
                 // agrega materias correspondientes al alumno
                 Hashtable<String,Integer> materias2 = new Hashtable<>();
                 materias2.put("Historia", 0); // calificación inicial 0
                 materias2.put("Ciencias Sociales", 0); // calificación inicial 0
                 
                 a.setMateriacalif(materias2);
               
                break;

            case 4: // Humanidades y de las artes
                admin.humanidadesYartes.add(a);

                 // agrega materias correspondientes al alumno
                 Hashtable<String,Integer> materias3 = new Hashtable<>();
                 materias3.put("Filosofia", 0); // calificación inicial 0
                 materias3.put("Artes Plasticas", 0); // calificación inicial 0
                 
                 a.setMateriacalif(materias3);
                break;

            default:
                break;
        }

        // agrega al alumno a las listas de los profesores de cada materia
        // del grupo correspondiente (A o B)
        Iterador<Profesor> ite = new Iterador<>(admin.profesores);

        while (ite.hasNext()) {
            Profesor profeActual = ite.next();
            if (profeActual.area == area & profeActual.grupo == grupo) {
                profeActual.agregaAlumnoALista(a);
            }
        }
        
         

        
    }

    // metodo a considerar implementar
   /* public String mensajeOk(){
        return "ok(?)";
    }
    */

}