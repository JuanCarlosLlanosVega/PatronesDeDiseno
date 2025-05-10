
public class Demandado extends Persona {
    //obtiene todos los datos de demandado del proceso
    public Demandado(String nombre, String ci, String direccion, String telefono) {
        super(nombre, ci, direccion, telefono);
    }

    public void actualizarDireccion(String nuevaDireccion) {
        this.direccion = nuevaDireccion;
        System.out.println("Dirección del demandado actualizada.");
    }

    public void actualizarTelefono(String nuevoTelefono) {
        this.telefono = nuevoTelefono;
        System.out.println("Teléfono del demandado actualizado.");
    }

    public boolean datosCompletos() {
        return nombre != null && !nombre.isEmpty() &&
               ci != null && !ci.isEmpty() &&
               direccion != null && !direccion.isEmpty() &&
               telefono != null && !telefono.isEmpty();
    }

    public void mostrarResumen() {
        System.out.println("--- RESUMEN DEL DEMANDADO ---");
        mostrarInformacion();
    }
}

