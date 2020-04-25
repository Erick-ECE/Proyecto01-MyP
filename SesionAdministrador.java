import java.util.Hashtable;
import java.util.Map;
//import java.util.Scanner;
import java.util.Scanner;


public class SesionAdministrador implements MenuSesion<Administrador> {

    @Override
    public void opcionesMenu(Administrador usuario) {
        int opcion;
        ContextoElimina c = null;
        ContextoConsulta cons = null;
        
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
                    // consultar lista de alumnos inscritos
                    Hashtable<Integer, Alumno> alumnos = usuario.getAlumnosTotales();
                   
                    for (Map.Entry<Integer, Alumno> entry : alumnos.entrySet()) {
                        int key = entry.getKey();
                        String value = entry.getValue().getNombre();
                    
                        System.out.println ("id: " + key + " Nombre: " + value);
                    }
                    
                    break;
                
                case 2: 
                    // consultar alumnos por area (Strategy)
                    System.out.println("Area de Estudio :");
                    System.out.println("    1.-Físico-Matemáticas.");
                    System.out.println("    2.-Ciencias Biológicas y de la Salud.");
                    System.out.println("    3.-Ciencias Sociales.");
                    System.out.println("    4.-Humanidades y Artes.");
                    int areaAconsultar = scr.nextInt();

                    cons = new ContextoConsulta(new ConsultaPorArea());
                    cons.ejecutaConsulta(areaAconsultar);
                    
                    break;
                
                case 3:
                    // consulta lista de alumnos por opcion tecnica (strategy)
                    System.out.println("Selecciona una opción técnica a consultar :");
                    System.out.println("    1.-Agente de viajes y hotelería.");
                    System.out.println("    2.-Fotógrafo, Laboratorista y Prensa.");
                    System.out.println("    3.-Nutriólogo.");
                    System.out.println("    4.-Laboratorista Químico.");
                    int ocionTecnica = scr.nextInt();
                    cons = new ContextoConsulta(new ConsultaPorOpcionTecnica());
                    cons.ejecutaConsulta(ocionTecnica);
                    
                    
                    break;
                
                case 4: // consultar lista profesores

                    Iterador<Profesor> ite = new Iterador<>(usuario.getProfesores());
                    ite.forEachRemaining(System.out::println);      
                    
                    break;

                case 5: // graduar alumno
                    System.out.println("Ingresa el id del alumno a graduar");
                    int idGraduado = scr.nextInt();
                    
                    GraduarAlumno.graduar(usuario.alumnosTotales.get(idGraduado));
                    
                    break;

                case 6: // inscribir alumno
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

                     //* Inscribe Alumno Estatico */
                     InscribeAlumno.inscribir(new Alumno(nombreNuevo,areaAlumno,nuevoGrupo));

                    
                    break;
                
                case 7:// Dar de baja un alumno:
                    /* *SIN PATRON STRATEGY:*
                    System.out.println("Ingrese el ID del alumno a dar de baja:");
                    int idBaja = scr.nextInt();
                    Alumno a = admin.getAlumnosTotales().get(idBaja);
                    BajaAlumno ba = new BajaAlumno();
                    if (a != null) {
                        ba.elimina(a);
                        break;
                    }
                    System.out.println("Usuario no encontrado");
                    */

                    // USANDO STRATEGY:
                    System.out.println("Ingrese el ID del alumno a dar de baja:");
                    int idBaja = scr.nextInt();

                    c = new ContextoElimina(new BajaAlumno());  
                    c.ejecutaOperacion(idBaja);
            
                    break;

                case 8: // contratar profesor
                    System.out.println("Ingresa el nombre del profesor:");
                    Scanner s = new Scanner(System.in);
                    String nombreProfe = s.nextLine();
                    
                    ContrataProfesor.contratar(new Profesor(nombreProfe));
                    
                    break;

                case 9: // Despedir Profesor
                    /** USANDO STRATEGY : */
                    System.out.println("Ingrese el ID del Profesor a dar de baja:");
                    int idProfe = scr.nextInt();

                    c = new ContextoElimina(new DespedirProfesor());
                    c.ejecutaOperacion(idProfe);

                    break;


                default:
                    break;
            }
            
            }while(opcion!=10);
        //scr.close();


    }

    

}