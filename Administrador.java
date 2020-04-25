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
    // lista alumnos por opcion tecnica:
    ArrayList<Alumno> viajesyhoteleria; // Agente de viajes y hotelería.
    ArrayList<Alumno> fotoLabPrensa; // Fotógrafo, Laboratorista y Prensa.
    ArrayList<Alumno> nutriologo; // Nutriólogo.
    ArrayList<Alumno> labQuimico; // Laboratorista Químico.

    


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

    public ArrayList<Alumno> getViajesyhoteleria() {
        return viajesyhoteleria;
    }

    public void setViajesyhoteleria(ArrayList<Alumno> viajesyhoteleria) {
        this.viajesyhoteleria = viajesyhoteleria;
    }

    public ArrayList<Alumno> getFotoLabPrensa() {
        return fotoLabPrensa;
    }

    public void setFotoLabPrensa(ArrayList<Alumno> fotoLabPrensa) {
        this.fotoLabPrensa = fotoLabPrensa;
    }

    public ArrayList<Alumno> getNutriologo() {
        return nutriologo;
    }

    public void setNutriologo(ArrayList<Alumno> nutriologo) {
        this.nutriologo = nutriologo;
    }

    public ArrayList<Alumno> getLabQuimico() {
        return labQuimico;
    }

    public void setLabQuimico(ArrayList<Alumno> labQuimico) {
        this.labQuimico = labQuimico;
    }

    

    

}