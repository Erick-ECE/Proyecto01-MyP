import java.util.Scanner;

public class SesionAlumno implements MenuSesion<Alumno> {

    @Override
    public void opcionesMenu(Alumno usuario){
        int opcion;
        String nombreUsuario = usuario.nombre;
        
        System.out.println("Binevenido"+ nombreUsuario +"!");

        do{
            System.out.println("Ingrese el numero de la opción a realizar:");
            System.out.println("    1.- Consultar la calificación de una materia.");
            System.out.println("    2.- Consultar su promedio.");
            System.out.println("    3.- Inscribirse a una opción técnica.");
            System.out.println("    4.- cerrar sesion");
            
            opcion = scr.nextInt();
    
            switch (opcion) {
                case 1:
                    
                    break;
                
                case 2:
                    
                    break;
                
                case 3:
                    
                    break;

                default:
                    break;
            }
            
            }while(opcion!=4);
        scr.close();

    }

}