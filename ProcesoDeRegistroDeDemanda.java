public abstract class ProcesoDeRegistroDeDemanda {

    public final void ejecutar() {  //aplica Patrón Template Method,
        crearDemandante();
        crearDemandado();
        crearFuncionario();
        construirDemanda();
        registrarDemanda();
        mostrarResumen();
    }

    protected abstract void crearDemandante();
    protected abstract void crearDemandado();
    protected abstract void crearFuncionario();
    protected abstract void construirDemanda();
    protected abstract void registrarDemanda();
    protected abstract void mostrarResumen();
}
