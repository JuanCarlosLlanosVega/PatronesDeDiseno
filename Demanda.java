import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Demanda {
    private String tipoDemanda; // Ejemplo: "Asistencia Familiar"
    private String fecha; // Su Formato es: "dd/mm/aaaa"
    private Demandante demandante;
    private Demandado demandado;
    private ReceptorJudicial funcionario;
    private String codigoNUREJ;
      private List<Observador> observadores = new ArrayList<>();

    public Demanda(String tipo, String fecha, Demandante demandante, Demandado demandado, ReceptorJudicial funcionario) {
        if (tipo == null || tipo.isEmpty()) {
            throw new IllegalArgumentException("El tipo de demanda no puede estar vacío.");
        }
        if (fecha == null || fecha.isEmpty()) {
            throw new IllegalArgumentException("La fecha no puede estar vacía.");
        }
        this.tipoDemanda = tipo;
        this.fecha = fecha;
        this.demandante = demandante;
        this.demandado = demandado;
        this.funcionario = funcionario;
        this.codigoNUREJ = generarNUREJ();
    }
    
    private String generarNUREJ() {
        Random rand = new Random();
        int numeroAleatorio = 10000 + rand.nextInt(90000); // rango para NUREJ entre 10000 y 99999
        return "2025" + numeroAleatorio;
    }
    
    public String getTipo() {
        return tipoDemanda;
    }

    public String getFecha() {
        return fecha;
    }

    public Demandante getDemandante() {
        return demandante;
    }

    public Demandado getDemandado() {
        return demandado;
    }

    public void actualizarFecha(String nuevaFecha) {
        if (nuevaFecha != null && !nuevaFecha.isEmpty()) {
            this.fecha = nuevaFecha;
            System.out.println("Fecha actualizada a: " + nuevaFecha);
        } else {
            System.out.println("Fecha inválida. No se realizó el cambio.");
        }
    }

    public boolean esDemandaValida() {
        return tipoDemanda != null && !tipoDemanda.isEmpty() &&
               fecha != null && !fecha.isEmpty() &&
               demandante != null && demandado != null &&
               demandante.datosCompletos() && demandado.datosCompletos();
    }

    public void agregarObservador(Observador obs) {
        observadores.add(obs);
    }
    
     public void notificarObservadores() {
        for (Observador o : observadores) {
            o.actualizar(this); // ?Acá notifica a los observadores
        } //patron Observador
    }
    
    public void registrar() {
        
        System.out.println("Estado: Demanda registrada.");
        notificarObservadores(); //Notifica a Registros
    } //patron Observador
    public void mostrarResumen() {
        
        System.out.println("CÓDIGO DE PROCESO NUREJ: " + codigoNUREJ);
        System.out.println("------------------------------ DEMANDA -----------------------------");
        System.out.println("Tipo de demanda: " + tipoDemanda);
        System.out.println("Fecha de registro: " + fecha);
        System.out.println("Demandante:");
        demandante.mostrarResumen();
        System.out.println("Demandado:");
        demandado.mostrarResumen(); 
        
        
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Demanda recibida por: " + funcionario.getNombre() + " Cargo: " + funcionario.getCargo());
        System.out.println("Juzgado: " + funcionario.getJuzgado()); 
        System.out.println("---------------------------------------------------------------------");
    }
    public String getCodigoNUREJ() {
        return codigoNUREJ;
    }
}



