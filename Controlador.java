

/**
 * Clase principal controla la simulación del programa
 */

public interface Controlador {
   

    
    public static void main(String[] args) {

        // llama simulacion primero
        Simula s = new Simula();
        // agrega profesores
        s.agregaMaestros();
        // agrega alumnos
        s.agregaAlumnos();


        Sesion.bienvenida();

    }

}