import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class SesionAdministrador implements MenuSesion<Administrador> {

    @Override
    public void opcionesMenu(Administrador usuario) {
        int opcion;
        
        System.out.println("Binevenido Administrador!");

        do{
            System.out.println("Ingrese el numero de la opción a realizar:");
            System.out.println("    1.- Consultar lista de alumnos inscritos en la escuela.");
            System.out.println("    2.- Consultar lista de alumnos de cada área.");
            System.out.println("    3.- Consultar lista de alumnos de opciones técnicas.");
            System.out.println("    4.- Consultar lista de profesores.");
            System.out.println("    5.- Graduar un alumno.");
            System.out.println("    6.- Inscribir un alumno.");
            System.out.println("    7.- Dar de baja un alumno.");
            System.out.println("    8.- Contratar un profesor.");
            System.out.println("    9.- Despedir un profesor.");
            System.out.println("    10.- cerrar sesion");
            
            opcion = scr.nextInt();
    
            switch (opcion) {
                case 1:
                    Hashtable<Integer, Alumno> alumnos = usuario.getAlumnosTotales();
                   
                    for (Map.Entry<Integer, Alumno> entry : alumnos.entrySet()) {
                        int key = entry.getKey();
                        String value = entry.getValue().getNombre();
                    
                        System.out.println ("id: " + key + " Nombre: " + value);
                    }
                    
                    break;
                
                case 2:
                    
                    break;
                
                case 3:
                    Hashtable<String,String> ot = usuario.getOpcionesTecnicas();
                    
                    for (Map.Entry<String, String> entry : ot.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        System.out.println ("Nombe: " + key + " OpcionTecnica: " + value);
                    }
                    
                     
                    
                    break;
                
                case 4:
                    
                    break;

                case 5:
                    
                    break;

                case 6:
                    System.out.println("Ingrese los datos que se piden del Alumno");
                    System.out.println("Nombre:");
                    String nombreNuevo = scr.nextLine();
                    System.out.println("Area de Estudio :");
                    System.out.println("    1.-Físico-Matemáticas.");
                    System.out.println("    2.-Ciencias Biológicas y de la Salud.");
                    System.out.println("    3.-Ciencias Sociales.");
                    System.out.println("    4.-Humanidades y Artes.");
                    int areaAlumno = scr.nextInt();
                    System.out.println("Grupo(A o B):");
                    char nuevoGrupo = scr.next().charAt(0);

                    Alumno nuevoAlumno = new Alumno(nombreNuevo,areaAlumno,nuevoGrupo);
                    InscribeAlumno ins = new InscribeAlumno();
                    ins.inscribir(nuevoAlumno);

                    
                    break;
                
                case 7:
                    System.out.println("Ingrese el ID del alumno a dar de baja:");
                    int idBaja = scr.nextInt();
                    Alumno a = admin.getAlumnosTotales().get(idBaja);
                    BajaAlumno ba = new BajaAlumno();
                    if (a != null) {
                        ba.elimina(a);
                        break;
                    }
                    System.out.println("Usuario no encontrado");
                    
                    break;

                case 8:
                    
                    break;

                case 9:
                    
                    break;


                default:
                    break;
            }
            
            }while(opcion!=10);
        scr.close();


    }

    

}