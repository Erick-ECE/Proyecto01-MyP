
public class SesionProfesor implements MenuSesion<Profesor> {

    @Override
    public void opcionesMenu(Profesor usuario) {
        int opcion;
        String nombreUsuario = usuario.nombre;
        
        System.out.println("Binevenido"+ nombreUsuario +"!");

        do{
            System.out.println("Ingrese el numero de la opción a realizar:");
            System.out.println("    1.- Consultar la información de su grupo.");
            System.out.println("    2.- Asignar calificaciones a cada alumno.");
            System.out.println("    3.- cerrar sesion");
            
            opcion = scr.nextInt();
    
            switch (opcion) {
                case 1:
                    
                    break;
                
                case 2:
                    
                    break;

                default:
                    break;
            }
            
            }while(opcion!=3);
        scr.close();

    }

}