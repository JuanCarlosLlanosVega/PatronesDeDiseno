
public class DemandaBuilder {       //Patr+on Builer 
    private String tipoDemanda;   //representa el conjunto de pasos para el registro
    private String fecha;
    private Demandante demandante;
    private Demandado demandado;
    private ReceptorJudicial funcionario;

    public DemandaBuilder setTipo(String tipo) {
        this.tipoDemanda = tipo;
        return this;
    }

    public DemandaBuilder setFecha(String fecha) {
        this.fecha = fecha;
        return this;
    }

    public DemandaBuilder setDemandante(Demandante demandante) {
        this.demandante = demandante;
        return this;
    }

    public DemandaBuilder setDemandado(Demandado demandado) {
        this.demandado = demandado;
        return this;
    }
    
    public DemandaBuilder setFuncionario(ReceptorJudicial funcionario) {
        this.funcionario = funcionario;
        return this;
    }
    
    public Demanda build() {
        return new Demanda(tipoDemanda, fecha, demandante, demandado, funcionario);
    }
}

