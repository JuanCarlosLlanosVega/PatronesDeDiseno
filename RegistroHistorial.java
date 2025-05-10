
public class RegistroHistorial implements Observador {
    public void actualizar(Demanda demanda) {
        System.out.println("🗃 Historial actualizado con nueva demanda de tipo: " + demanda.getTipo());
    }
} // Aplicación del patron Observer
