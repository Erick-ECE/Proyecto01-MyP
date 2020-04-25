import java.util.Hashtable;
import java.util.Map;


//import java.util.Set;

//import java.util.Scanner;

public class SesionAlumno implements MenuSesion<Alumno> {

    @Override
    public void opcionesMenu(Alumno usuario){
        int opcion;
        String nombreUsuario = usuario.nombre;
        
        System.out.println("Binevenido  "+ nombreUsuario +"!");

        do{
            System.out.println("Ingrese el numero de la opción a realizar:");
            System.out.println("    1.- Consultar la calificación de una materia.");
            System.out.println("    2.- Consultar su promedio.");
            System.out.println("    3.- Inscribirse a una opción técnica.");
            System.out.println("    4.- cerrar sesion");
            
            opcion = scr.nextInt();
    
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el numero de la opcion deseada:");
                    Hashtable<String,Integer> materias = usuario.getMateriacalif();
                    int j = 1;  
                    String[] keys= new String[2]; 

                    for (Map.Entry<String, Integer> entry : materias.entrySet()) {
                        String key = entry.getKey();
                        keys[j-1] = key;
                        System.out.println("    "+j+".-" + key);
                        j++;
                    }   
                    String materia = (scr.nextInt() == 1) ? keys[0] : keys[1];
                    System.out.printf("Calificacion %s: %d \n",materia, usuario.getMateriacalif().get(materia)); 
                    break;
                
                case 2:
                    System.out.println("Promedio: "+ usuario.calculatePromedio());
                    break;
                
                case 3:
                    InscribeOpcionTecnica.inscribeOpcionTecnica(usuario);    
                    break;

                default:
                    break;
            }
            
            }while(opcion!=4);
        

    }

}