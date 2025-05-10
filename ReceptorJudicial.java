

public class ReceptorJudicial extends Persona {
    private String correoInstitucional;
    private String cargo;
    private String juzgado; //obtiene datos generales del fucnonario publico

    public ReceptorJudicial(String nombre, String cargo, String juzgado) {
        super(nombre, "N/A", "No aplica", "No aplica");
        //super(nombre, ci, direccion, telefono);
        //this.correoInstitucional = correoInstitucional;
        this.correoInstitucional = "no-definido@tribunal.bo"; 
        this.cargo = cargo;
        this.juzgado = juzgado;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public String getCargo() {
        return cargo;
    }

    public String getJuzgado() {
        return juzgado;
    }

    public void actualizarJuzgado(String nuevoJuzgado) {
        this.juzgado = nuevoJuzgado;
        System.out.println("Juzgado actualizado a: " + nuevoJuzgado);
    }

    public void mostrarResumen() {
        System.out.println("--- RECEPTOR JUDICIAL ---");
        mostrarInformacion(); // de Persona
        //System.out.println("Correo institucional: " + correoInstitucional);
        System.out.println("Cargo: " + cargo);
        System.out.println("Juzgado: " + juzgado);
    }
    
    public void recibirDemanda(Demanda demanda) {
   // System.out.println("Demanda recibida por: " + getNombre() + " (Correo: " + getCorreoInstitucional() + ")");
    //System.out.println("Cargo: " + getCargo() + " | Juzgado: " + getJuzgado());
    //demanda.mostrarResumen();
}
   
}
