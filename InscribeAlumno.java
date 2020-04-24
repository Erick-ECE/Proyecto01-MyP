/**
 * Del Caso de Uso "Inscrie Alumno"
 * registra un nuevo alumno en las listas correspondientes
 */
public class InscribeAlumno {
    private static Administrador admin = Administrador.getInstance();

    public static void inscribir(Alumno a){
        int area= a.area;
        char grupo = a.grupo;

        admin.alumnosTotales.put(a.id, a); // agrega a la lista general
        
        //Para agregar a la lista por area
        switch (area) {
            case 1: // fisico matematicas
                admin.fisicoMatematicas.add(a);
                break;
            
            case 2: // biologicas y de la salud
                admin.biologicasYsalud.add(a);
                break;
                
            case 3: // ciencias sociales
                admin.cienciasSociales.add(a);
                break;

            case 4: // Humanidades y de las artes
                admin.humanidadesYartes.add(a);
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
    public String mensajeOk(){
        return "ok(?)";
    }

}