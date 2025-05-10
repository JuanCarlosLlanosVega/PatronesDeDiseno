
public abstract class Persona implements IPersona {  
    protected String nombre; 
    protected String ci;
    protected String direccion;
    protected String telefono;
//es una clase base para las demas clases
    public Persona(String nombre, String ci, String direccion, String telefono) {
        this.nombre = nombre;
        this.ci = ci;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCi() {
        return ci;
    }

    public String getDireccion() {
        return direccion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("CI: " + ci);
        System.out.println("Dirección: " + direccion);
    }
}
