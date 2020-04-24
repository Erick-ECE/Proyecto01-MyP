
import java.util.Enumeration;
import java.util.Hashtable;


public class Alumno  {
    int id;
    String nombre;
    Hashtable<String,Integer> materiacalif;
    String opcionTecnica;
    Double promedio;
    int area; // 1.- Fisico-Matematico 2.- Biologicas Y de la Salud 3.-Ciencias Sociales 4.- Humanidades y Artes
    char grupo;

    Enumeration<Integer> enu = materiacalif.elements();

    /**constructor vacío */
    public Alumno(){} 
    
    /**Constrictor para alumno sin opcion tecnica */
    public Alumno(String nombre, int area, char grupo) {
        this.nombre = nombre;
        this.area = area;
        this.grupo = grupo;
    }

    /**Constructor para alumno con  opcion tecnica */
    public Alumno(String nombre, String opcionTecnica, int area, char grupo) {
        this.nombre = nombre;
        this.opcionTecnica = opcionTecnica;
        this.area = area;
        this.grupo = grupo;
    }

    /**calcula el promedio de las materias inscritas del alumno */
    public Double calculatePromedio() {
        int temp=0;
        while (enu.hasMoreElements()) { 
            temp = temp + (int)enu.nextElement(); 
        } 
        return (double) temp/materiacalif.size();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Hashtable<String, Integer> getMateriacalif() {
        return materiacalif;
    }

    public void setMateriacalif(Hashtable<String, Integer> materiacalif) {
        this.materiacalif = materiacalif;
    }

    public String getOpcionTecnica() {
        return opcionTecnica;
    }

    public void setOpcionTecnica(String opcionTecnica) {
        this.opcionTecnica = opcionTecnica;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public Enumeration<Integer> getEnu() {
        return enu;
    }

    public void setEnu(Enumeration<Integer> enu) {
        this.enu = enu;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    /** verifica si el alumno inscribio opcion tecnica */
    public boolean tieneOpcionTecnica(){
        return opcionTecnica != null;
    }
   
}