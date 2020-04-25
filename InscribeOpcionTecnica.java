import java.util.Scanner;

public class InscribeOpcionTecnica {
    static Administrador admin = Administrador.getInstance();
    

    public static void inscribeOpcionTecnica(Alumno alumno){
        Scanner scr = new Scanner (System.in);

        System.out.println("Elige la opcón técnica a la que te deseas inscribir :");
        System.out.println("    1.-Agente de viajes y hotelería.");
        System.out.println("    2.-Fotógrafo, Laboratorista y Prensa.");
        System.out.println("    3.-Nutriólogo.");
        System.out.println("    4.-Laboratorista Químico.");
        int opcion = scr.nextInt();

        switch (opcion) {
            case 1: // Agente de viajes y hotelería.
                alumno.setOpcionTecnica("Agente de viajes y hotelería");
                admin.viajesyhoteleria.add(alumno);
                System.out.println("Has quedado inscrito a la opcion tecnica: Agente de viajes y hotelería.");
                break;
        
            case 2: // Fotógrafo, Laboratorista y Prensa.
                alumno.setOpcionTecnica("Fotógrafo, Laboratorista y Prensa");
                admin.fotoLabPrensa.add(alumno);
                System.out.println("Has quedado inscrito a la opcion tecnica: Fotógrafo, Laboratorista y Prensa.");
                break;

            case 3: // Nutriólogo.
                alumno.setOpcionTecnica("Nutriólogo");
                admin.nutriologo.add(alumno);
                System.out.println("Has quedado inscrito a la opcion tecnica: Nutriólogo.");
                break;
            
            case 4: // Laboratorista Químico.
                alumno.setOpcionTecnica("Laboratorista Químico");
                admin.labQuimico.add(alumno);
                System.out.println("Has quedado inscrito a la opcion tecnica: Laboratorista Químico.");
                break;

            default:
                break;
        }

        scr.close();


    }

}