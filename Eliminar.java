/*** Interfaz Eliminar
 *  describe el comportamiento de borrar un Usuario
 */
public interface Eliminar {
    Administrador admin = Administrador.getInstance();

    /** eliminar
     *  elimina al usuario con el id dado
     */
    public  void elimina(int id_usuario);

}