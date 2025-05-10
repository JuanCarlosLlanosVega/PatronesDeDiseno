
public class NotificadorCorreoDemand implements Observador { 
    public void actualizar(Demanda demanda) {
        System.out.println("📧 Se envió la confirmación al correo del demandante: " + demanda.getDemandante().getCorreo());
    }
} // Aplicación del patron Observer
