import java.util.ArrayList;
import java.util.Hashtable;

public class Administrador {
    Profesor[] profesores = new Profesor[20]; // 20 profesores
    Hashtable<Integer,Alumno> alumnosTotales;
    // listas por area:
    ArrayList<Alumno> fisicoMatematicas;
    ArrayList<Alumno> biologicasYsalud;
    ArrayList<Alumno> cienciasSociales;
    ArrayList<Alumno> humanidadesYartes;
    //-----------------
    // listas por grupo:
    

    // Patron Singleton 
    private static Administrador instance = null;

    public static  Administrador getInstance() {
        if (instance == null) {
            instance = new Administrador();
        }
        return instance;
    }

    public Profesor[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }

    public Hashtable<Integer, Alumno> getAlumnosTotales() {
        return alumnosTotales;
    }

    public void setAlumnosTotales(Hashtable<Integer, Alumno> alumnosTotales) {
        this.alumnosTotales = alumnosTotales;
    }

    public ArrayList<Alumno> getFisicoMatematicas() {
        return fisicoMatematicas;
    }

    public void setFisicoMatematicas(ArrayList<Alumno> fisicoMatematicas) {
        this.fisicoMatematicas = fisicoMatematicas;
    }

    public ArrayList<Alumno> getMedicoBiologicas() {
        return medicoBiologicas;
    }

    public void setMedicoBiologicas(ArrayList<Alumno> medicoBiologicas) {
        this.medicoBiologicas = medicoBiologicas;
    }

    public ArrayList<Alumno> getCienciasSociales() {
        return cienciasSociales;
    }

    public void setCienciasSociales(ArrayList<Alumno> cienciasSociales) {
        this.cienciasSociales = cienciasSociales;
    }

    public ArrayList<Alumno> getHumanidadesYartes() {
        return humanidadesYartes;
    }

    public void setHumanidadesYartes(ArrayList<Alumno> humanidadesYartes) {
        this.humanidadesYartes = humanidadesYartes;
    }

    public static void setInstance(Administrador instance) {
        Administrador.instance = instance;
    }

    

}