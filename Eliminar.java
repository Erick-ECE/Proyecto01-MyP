
public interface Eliminar<T> {
    Administrador admin = Administrador.getInstance();

    public void darDeBaja(T usuario);

}