/**
 * Del Caso de Uso "Inscrie Alumno"
 * registra un nuevo alumno en las listas correspondientes
 */
public class InscribeAlumno {
    Administrador admin = Administrador.getInstance();

    public void inscribir(Alumno a){
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

        // agregar al grupo 
        Iterador<Profesor> ite = new Iterador<>(admin.profesores);

        

        

        
    }

}