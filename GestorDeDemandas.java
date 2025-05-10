public class GestorDeDemandas {  //Esto es el Patron FACADE
 
    public void registrarDemandaCompleta(
    String tipo,
    String fecha,
    String nombreDemandante, String ciDemandante, String direccionDemandante, String telefonoDemandante, String correoDemandante,
    String nombreDemandado, String ciDemandado, String direccionDemandado, String telefonoDemandado,
    String nombreFuncionario, String cargoFuncionario, String juzgadoFuncionario
)

    {
        // Aqui va Crear objetos de personas
        Demandante demandante = new Demandante(nombreDemandante, ciDemandante, direccionDemandante, telefonoDemandante, correoDemandante);
        Demandado demandado = new Demandado(nombreDemandado, ciDemandado, direccionDemandado, telefonoDemandado);
        ReceptorJudicial funcionario = new ReceptorJudicial(nombreFuncionario, cargoFuncionario, juzgadoFuncionario);

        // Aqui usar el patron Builder para crear la demanda
        Demanda demanda = new DemandaBuilder()
            .setTipo(tipo)
            .setFecha(fecha)
            .setDemandante(demandante)
            .setDemandado(demandado)
            .setFuncionario(funcionario)
            .build();

        // Mostra el resultado final
        demanda.mostrarResumen();

        // Registra el funcionario
        funcionario.recibirDemanda(demanda);
    }
}
