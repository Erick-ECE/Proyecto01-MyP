import java.util.Iterator;

public class Iterador<T> implements Iterator<T> {
    private T[] arreglo;
    private int i = 0;

    public Iterador(T[] arreglo){
        this.arreglo = arreglo;
    }

    @Override
    public boolean hasNext() {
        //return arreglo.length > i;
        return (arreglo[i] != null) & arreglo.length > i ;
    }

    @Override
    public T next() {
        return arreglo[i++];
    }


}