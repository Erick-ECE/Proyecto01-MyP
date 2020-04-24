import java.util.ArrayList;
import java.util.Hashtable;

public class Administrador {
    int MAX_VACANTES = 20;// numero maximo de vacantes de profesores
    Profesor[] profesores = new Profesor[MAX_VACANTES]; 
    Hashtable<Integer,Alumno> alumnosTotales; // <ID_alumno, Alumno>
    // listas por area:
    ArrayList<Alumno> fisicoMatematicas;
    ArrayList<Alumno> biologicasYsalud;
    ArrayList<Alumno> cienciasSociales;
    ArrayList<Alumno> humanidadesYartes;
    //-----------------
    // lista alumnos con opcion tecnica:
    Hashtable<String,String> opcionesTecnicas; // <NombreAlumno, OpcionTecnica>


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

    public ArrayList<Alumno> getBiologicasYsalud() {
        return biologicasYsalud;
    }

    public void setBiologicasYsalud(ArrayList<Alumno> biologicasYsalud) {
        this.biologicasYsalud = biologicasYsalud;
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

    public Hashtable<String, String> getOpcionesTecnicas() {
        return opcionesTecnicas;
    }

    public void setOpcionesTecnicas(Hashtable<String, String> opcionesTecnicas) {
        this.opcionesTecnicas = opcionesTecnicas;
    }

    

}