package modelo;

public class Persona {
    private int id;
    private long nroIdentificacion;
    private String apellidos;
    private String nombres;
    private String telefono;
    private String email;

    public Persona(){
        id = 0;
        nroIdentificacion = 0;
        apellidos = "";
        nombres = "";
        telefono = "";
        email = "";
    }

    public Persona(int id, long nroIdentificacion, String apellidos, String nombres, String telefono, String email) {
        this.id = id;
        this.nroIdentificacion = nroIdentificacion;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.telefono = telefono;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getNroIdentificacion() {
        return nroIdentificacion;
    }

    public void setNroIdentificacion(long nroIdentificacion) {
        this.nroIdentificacion = nroIdentificacion;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
