import java.util.Iterator;

public class ConsultaPorArea implements Consulta {

    /** @param id Area de estudio a consultar
     * imprime la lista de Alumnos del area @param id 
     */
    @Override
    public void consultar(int id) {
        switch (id) {
            case 1: // fisico matematicas
                Iterator<Alumno> iter = admin.getFisicoMatematicas().iterator();
                iter.forEachRemaining(System.out::println);

                break;
        
            case 2: // Ciencias Biológicas y de la Salud
                Iterator<Alumno> iter1 = admin.getBiologicasYsalud().iterator();
                iter1.forEachRemaining(System.out::println);
                
                break;

            case 3: // Ciencias Sociales:
                Iterator<Alumno> iter2 = admin.getCienciasSociales().iterator();
                iter2.forEachRemaining(System.out::println);
                
                break;
            
            case 4: // Humanidades y Artes:
                Iterator<Alumno> iter3 = admin.getHumanidadesYartes().iterator();
                iter3.forEachRemaining(System.out::println);

                break;

            default:
                break;
        }
        

    }

}