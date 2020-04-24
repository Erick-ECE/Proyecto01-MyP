
public interface Eliminar<T> {
    Administrador admin = Administrador.getInstance();

    public  void elimina(T usuario);

}