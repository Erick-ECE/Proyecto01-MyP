
public class DespedirProfesor implements Eliminar{

    @Override
    public void elimina(int id_profesor) {
        // Implementar Baja del Profesor
        // Busca profesor por id y eliminalo de las listas
       Profesor[] lista = admin.profesores;

        for(int i = 0; i < lista.length; i++){
            if(lista[i].id == id_profesor){
                // shifting elements
                for(int j = i; j < lista.length - 1; j++){
                    lista[j] = lista[j+1];
                }
                break;
            }
        }
        Administrador.PROFES_CONTRATADOS--;

    }

}