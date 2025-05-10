
public class Demandante extends Persona { //Clase que obtiene los datos del demandante
    private String correo;

    public Demandante(String nombre, String ci, String direccion, String telefono, String correo) {
        
        super(nombre, ci, direccion, telefono);
        if (!esCorreoValido(correo)) {
            throw new IllegalArgumentException("Correo electrónico inválido");
        }
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String nuevoCorreo) {
        if (esCorreoValido(nuevoCorreo)) {
            this.correo = nuevoCorreo;
        } else {
            System.out.println("Correo inválido. No se ha actualizado.");
        }
    }

    public void actualizarDatosContacto(String nuevaDireccion, String nuevoTelefono) {
        this.direccion = nuevaDireccion;
        this.telefono = nuevoTelefono;
        System.out.println("Datos de contacto actualizados.");
    }

    private boolean esCorreoValido(String correo) {
        return correo != null && correo.contains("@") && correo.contains(".");
    }

    public boolean datosCompletos() {
        return nombre != null && !nombre.isEmpty() &&
               ci != null && !ci.isEmpty() &&
               direccion != null && !direccion.isEmpty() &&
               telefono != null && !telefono.isEmpty() &&
               correo != null && esCorreoValido(correo);
    }

    public void mostrarResumen() {
        System.out.println("--- RESUMEN DEL DEMANDANTE ---");
        mostrarInformacion();
        System.out.println("Correo electrónico: " + correo);
    }
}

