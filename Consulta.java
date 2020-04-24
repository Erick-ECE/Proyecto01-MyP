/** Interfaz Consulta 
 *  Define el comportamiento de las distintas consultas hechas por cada usuario
*/
public interface Consulta {
    Administrador admin = Administrador.getInstance();

    /**
     * 
     * @param id identificador de la consulta a realizar
     */
    public void consultar(int id);


}