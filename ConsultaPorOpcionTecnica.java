import java.util.Iterator;

public class ConsultaPorOpcionTecnica implements Consulta {

    @Override
    public void consultar(int id) {
        switch (id) {
            case 1: // Agente de viajes y hotelería.
                Iterator<Alumno> iter = admin.viajesyhoteleria.iterator();
                iter.forEachRemaining(System.out::println);
                
                break;
        
            case 2: // Fotógrafo, Laboratorista y Prensa.
                Iterator<Alumno> iter1 = admin.fotoLabPrensa.iterator();
                iter1.forEachRemaining(System.out::println);
                
                break;

            case 3: // Nutriólogo.
                Iterator<Alumno> iter2 = admin.nutriologo.iterator();
                iter2.forEachRemaining(System.out::println);
               
                
                break;
            
            case 4: // Laboratorista Químico.
                Iterator<Alumno> iter3 = admin.labQuimico.iterator();
                iter3.forEachRemaining(System.out::println);

                break;

            default:
                break;
        }

    }

}