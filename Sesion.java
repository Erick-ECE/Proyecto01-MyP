import java.util.Scanner;

public class Sesion {
    static Administrador admin = Administrador.getInstance();

    public Sesion(){}
    
    public static void bienvenida(){
        int opcion;
        Scanner scr = new Scanner (System.in);
        
        System.out.println("Binevenido!");

        do{
            System.out.println("Elija una opcion de acceso (ingrese el numero)");
            System.out.println("    1.- Administrador");
            System.out.println("    2.- Alumno");
            System.out.println("    3.- Profesor");
            System.out.println("    4.- salir");
            
            opcion = scr.nextInt();
    
            switch (opcion) {
                case 1:
                    // Administrador
                    SesionAdministrador sa = new SesionAdministrador();
                    sa.opcionesMenu(admin);

                    break;
                
                case 2:
                    // Alumno
                    System.out.println("Ingresa tu ID");// se probara con id else usare nombre
                    int id_usuario = scr.nextInt();
                    Alumno usuario = admin.alumnosTotales.get(id_usuario);
                    if(usuario != null){
                        SesionAlumno sal = new SesionAlumno();
                        sal.opcionesMenu(usuario);
                        break;
                    }
                    System.out.println("Usuario no encontrado");                    
                    
                    break;
                
                case 3:
                    // Profesor
                    System.out.println("Ingresa tu ID");// se probara con id else usare nombre
                    int id_profe = scr.nextInt();

                    SesionProfesor sp = new SesionProfesor();
                    
                    Iterador<Profesor> ite = new Iterador<>(admin.profesores);
                    
                    while (ite.hasNext()) {
                        Profesor profeActual = ite.next();
                        if (profeActual.id == id_profe ) {
                            sp.opcionesMenu(profeActual);
                            break;  
                        }
                    }

                    System.out.println("Usuario no encontrado");
                   
                    break;
                
                default:
                    break;
            }
            
            }while(opcion!=4);
        scr.close();

    }

}