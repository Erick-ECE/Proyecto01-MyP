import java.util.HashMap;

public class Profesor {
    int id;
    String nombre;
    HashMap<Integer, Integer> id_Calif;
    int area;
    String materia;
    char grupo;

    public Profesor() {
        this.id = IdGen.getInstance().getUniqueId();
    }

    public Profesor(String nombre, HashMap<Integer, Integer> id_Calif, int area, String materia, char grupo) {
        this.id = IdGen.getInstance().getUniqueId();
        this.nombre = nombre;
        this.id_Calif = id_Calif;
        this.area = area;
        this.materia = materia;
        this.grupo = grupo;
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

    public HashMap<Integer, Integer> getId_Calif() {
        return id_Calif;
    }

    public void setId_Calif(HashMap<Integer, Integer> id_Calif) {
        this.id_Calif = id_Calif;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    public void agregaAlumnoALista(Alumno a) {
        id_Calif.put(a.id, 0);
    }

    public void asignaCalifByID(int id, int calif) {
        id_Calif.put(id, calif);
    }

    public void asignaCalifAlumno(Alumno a, int calif) {
        id_Calif.put(a.id, calif);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID : ").append(this.id).append("\n");
        sb.append("Nombre : ").append(this.nombre).append("\n");
        sb.append("Materia : ").append(this.materia).append("\n");
        return sb.toString();
    }

    
    

}