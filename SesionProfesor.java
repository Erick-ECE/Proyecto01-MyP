import java.util.Hashtable;
import java.util.Map;
//import java.util.Map.Entry;

public class SesionProfesor implements MenuSesion<Profesor> {

    @Override
    public void opcionesMenu(Profesor usuario) {
        int opcion;
        String nombreUsuario = usuario.nombre;

        System.out.println("Binevenido" + nombreUsuario + "!");

        do {
            System.out.println("Ingrese el numero de la opción a realizar:");
            System.out.println("    1.- Consultar la información de su grupo.");
            System.out.println("    2.- Asignar calificaciones a cada alumno.");
            System.out.println("    3.- cerrar sesion");

            opcion = scr.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("----------Informacion de Grupo----------");
                    System.out.println("Materia: " + usuario.materia);
                    System.out.println("Grupo: " + usuario.grupo);
                    Hashtable<Integer, Integer> alumnos = usuario.getId_Calif();

                    for (Map.Entry<Integer, Integer> entry : alumnos.entrySet()) {
                        int key = entry.getKey();
                        int value = entry.getValue();
                    
                        System.out.println ("ID Alumno: " + key + " Calificación: " + value);
                    }   

                    break;
                
                case 2:
                System.out.println("Ingresa la calificacion de cada alumno:");
                Hashtable<Integer, Integer> alumnosCalificacion = usuario.getId_Calif();

                for (Map.Entry<Integer, Integer> entry : alumnosCalificacion.entrySet()) {
                    int key = entry.getKey();
                    System.out.println ("ID Alumno: " + key);
                    System.out.print(" Calificación: ");
                    int calif =scr.nextInt();
                    entry.setValue(calif);
                    //usuario.asignaCalifByID(key, calif);
                }
                    
                    break;

                default:
                    break;
            }
            
            }while(opcion!=3);
        scr.close();

    }

}