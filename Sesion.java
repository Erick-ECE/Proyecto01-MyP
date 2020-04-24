import java.util.Scanner;

public class Sesion {

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
                    System.out.println("    1.- Administrador");
                    // 
                    
                    break;
                
                case 2:
                    // Alumno
                    System.out.println("    Alumno");
                    
                    
                    break;
                
                case 3:
                    // Profesor
                    System.out.println("    profesor");
                    
                    
                    break;
                
                default:
                    break;
            }
            
            }while(opcion!=4);
        scr.close();

    }

}