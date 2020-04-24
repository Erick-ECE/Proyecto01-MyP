
public class ContextoConsulta {
    Consulta consulta;
    
    public ContextoConsulta(Consulta consulta){
        this.consulta = consulta;
    }

    public void ejecutaConsulta(int identificador){
        consulta.consultar(identificador);
    }

}