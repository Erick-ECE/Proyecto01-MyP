
public class ContextoElimina {
    private Eliminar estrategia;

    public ContextoElimina(Eliminar estrategia) {
        this.estrategia = estrategia;
    }

    public void ejecutaOperacion(int id){
        estrategia.elimina(id);
    }
}