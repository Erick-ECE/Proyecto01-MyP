
public class BajaAlumno implements Eliminar {

    @Override
    public void elimina(int id_alumno) {
        // implementar baja de alumno
        // busca alumno por id y eliminalo de las listas

        try {
            Alumno a = admin.alumnosTotales.get(id_alumno);
            int area = a.area;
            char grupo = a.grupo;

            admin.fisicoMatematicas.remove(a);
            admin.biologicasYsalud.remove(a);
            admin.cienciasSociales.remove(a);
            admin.humanidadesYartes.remove(a);
            admin.fotoLabPrensa.remove(a);
            admin.viajesyhoteleria.remove(a);
            admin.nutriologo.remove(a);
            admin.labQuimico.remove(a);

            Iterador<Profesor> ite = new Iterador<>(admin.profesores);

            while (ite.hasNext()) {
                Profesor profeActual = ite.next();
                if (profeActual.area == area & profeActual.grupo == grupo) {
                    profeActual.eliminaAlumnoLista(a);
                }
            }
            
            admin.alumnosTotales.remove(id_alumno);
            
        } catch (NullPointerException e) {
            System.out.println("No existe el Alumno");
        }
        
        

    }

}