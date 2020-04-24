/**
 * IdGen
 * Clase que implementa el patron de diseño Singleton 
 * para poder generar id's de manera automatica
 *  */ 
public class IdGen {
    private static IdGen instance = null;

    public static  IdGen getInstance() {
        if (instance == null) {
            instance = new IdGen();
        }
        return instance;
    }

    private int nextID = 0;

    public int getUniqueId() {
        if (nextID < 0) {
            throw new IllegalStateException("se acabaron los id's");
        }

        int uniqueId = nextID;
        nextID++;

        return uniqueId;
    }
}