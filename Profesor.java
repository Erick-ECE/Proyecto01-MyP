import java.util.Hashtable;

public class Profesor {
    int id;
    String nombre;
    Hashtable<Integer, Integer> id_Calif;
    int area;
    String materia;
    char grupo;
    boolean instructor = false;

    public Profesor() {
        this.id = IdGen.getInstance().getUniqueId();
    }

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public Profesor(String nombre, int area, String materia, char grupo) {
        this.nombre = nombre;
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

    public Hashtable<Integer, Integer> getId_Calif() {
        return id_Calif;
    }

    public void setId_Calif(Hashtable<Integer, Integer> id_Calif) {
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

    public void agregaAlumnoALista(Alumno a) { // agrega alumno a lista con calificacion 0
        id_Calif.put(a.id, 0);
    }

    public void eliminaAlumnoLista(Alumno a){
        id_Calif.remove(a.id);
    }

    public void asignaCalifByID(int id, int calif) {
        id_Calif.put(id, calif);
    }

    public void asignaCalifAlumno(Alumno a, int calif) {
        id_Calif.put(a.id, calif);
    }

    public void autoAsignarArea(){ // si no pertenece a ninguna area entonces es instructor
        switch (this.materia) {
            case "Fisica":
                this.area= 1;
                break;
            case "Matematicas":
                this.area= 1;
                break;

            case "Biologia":
                this.area= 2;
                break;

            case "Quimica":
                this.area= 2;
                break;

            case "Historia":
                this.area= 3;
                break;

            case "Ciencias Sociales":
                this.area= 3;
                break;

            case "Filosofia":
                this.area= 4;
                break;

            case "Artes Plasticas":
                this.area= 4; 
                break;
        
            default:
                this.instructor = true; // es instructor de opcion tecnica 
                break;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID : ").append(this.id).append("\n");
        sb.append("Nombre : ").append(this.nombre).append("\n");
        sb.append("Materia : ").append(this.materia).append("\n");
        sb.append("---------------------------");
        return sb.toString();
    }

    
    

}