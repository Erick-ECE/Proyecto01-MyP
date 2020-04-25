import java.util.ArrayList;
import java.util.Random;

public class ContrataProfesor {
    static Administrador admin = Administrador.getInstance();
    

    public static void contratar(Profesor p){
        if (Administrador.PROFES_CONTRATADOS != admin.MAX_VACANTES) {
            // seleccionamos de manera aletoria un grupo y materia
            Random random = new Random();
            String materiaAleatoria;
            char grupoRandom = new Random().nextBoolean() ? 'A' : 'B';
            ArrayList<String> materias = new ArrayList<>();

            materias.add("Fisica");
            materias.add("Matematicas");
            materias.add("Biologia");
            materias.add("Quimica");
            materias.add("Historia");
            materias.add("Ciencias Sociales");
            materias.add("Filosofia");
            materias.add("Artes Plasticas");
            
            materiaAleatoria = materias.get( random.nextInt(materias.size()) );

            // se los asignamos al profesor p
            p.setGrupo(grupoRandom);
            p.setMateria(materiaAleatoria);
            p.autoAsignarArea();
            
            // Lo agregamos a la lista de profesores
            admin.profesores[Administrador.PROFES_CONTRATADOS++] = p;
            System.out.println("Profesor contratado!");
            System.out.println(p);
        }else{
            System.out.println("Lo siento, ya no hay vacantes");
        }
        
    }

}