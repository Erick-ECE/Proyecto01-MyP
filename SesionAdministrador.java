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
                    
                    break;
                
                case 2:
                    
                    break;
                
                case 3:
                    
                    break;
                
                case 4:
                    
                    break;

                case 5:
                    
                    break;

                case 6:
                    
                    break;
                
                case 7:
                    
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