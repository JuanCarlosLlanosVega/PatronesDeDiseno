public class RegistroCompletoPorFormulario extends ProcesoDeRegistroDeDemanda {
    private Demandante demandante;
    private Demandado demandado;
    private ReceptorJudicial funcionario;
    private Demanda demanda;
    // aqui se implemento el patron de diseño Template Method
    protected void crearDemandante() {
        demandante = new Demandante("Ana Pérez", "5436045", "Av. Blanco Galindo", "72067743", "ana@gmail.com");
    }

    protected void crearDemandado() {
        demandado = new Demandado("Luis Rojas", "654321", "Calle Rojo", "63495501");
    }

    protected void crearFuncionario() {
        funcionario = new ReceptorJudicial("Dr. Vargas", "Funcionario Judicial", "Juzgado de Familia #1");
    }

    protected void construirDemanda() {
        demanda = new DemandaBuilder()
            .setTipo("Asistencia Familiar")
            .setFecha("2025-05-01")
            .setDemandante(demandante)
            .setDemandado(demandado)
            .setFuncionario(funcionario)
            .build();
            demanda.agregarObservador(new NotificadorCorreoDemand());
            demanda.agregarObservador(new RegistroHistorial());
    }

    protected void registrarDemanda() {
        funcionario.recibirDemanda(demanda);
    }

    protected void mostrarResumen() {
        demanda.mostrarResumen();
    }
     // todo esto es como un modelo a seguir los algoritmos de registros de demandas
    
}
