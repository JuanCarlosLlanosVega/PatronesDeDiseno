
public class Main {
    public static void main(String[] args) {
            /*
            Demandante d1 = new Demandante("Ana Pérez", "5436045", "Av. Blanco Galindo", "72067743", "ana@gmail.com");
            Demandado d2 = new Demandado("Luis Rojas", "654321", "Calle Rojo", "63495501");
            Demanda demanda = new Demanda("Asistencia Familiar", "2025-05-01", d1, d2);
            ReceptorJudicial funcionario = new ReceptorJudicial(
            "Dr. Vargas",               // nombre
            "5345623",                   // ci
            "Palacio de Justicia",      // dirección
            "74984402",                 // teléfono
            "vargas@tribunal.bo",       // correoInst // anteriormente TODO esto sin aplicar el PATRON BUILDER
            "Funcionario Judicial",     // cargo
            "Juzgado de Familia #1"     // juzgado
           );
            funcionario.recibirDemanda(demanda);
          */
 
 
             ProcesoDeRegistroDeDemanda proceso = new RegistroCompletoPorFormulario();
             proceso.ejecutar(); 
            
            
            Demandante d1 = new Demandante("Ana Pérez", "5436045", "Av. Blanco Galindo", "72067743", "ana@gmail.com");
            Demandado d2 = new Demandado("Luis Rojas", "654321", "Calle Rojo", "63495501");
            ReceptorJudicial funcionario = new ReceptorJudicial("Dr. Vargas", "Funcionario Judicial", "Juzgado de Familia #1");
    
            Demanda demanda = new DemandaBuilder()
                .setTipo("Asistencia Familiar")
                .setFecha("2025-05-01")
                .setDemandante(d1)
                .setDemandado(d2)
                .setFuncionario(funcionario)
                .build();
    
            // Patron Observador
            demanda.agregarObservador(new NotificadorCorreoDemand());
            demanda.agregarObservador(new RegistroHistorial());
            // Genera notificaciones
            // Registrar la demanda 
            demanda.registrar();
            
    }
}
