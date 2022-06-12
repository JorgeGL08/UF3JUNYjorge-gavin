
public class Alumno {

    private String nombre;

    private String apellido1;

    private String apellido2;

    private String email;

    private String fechaNacimiento;

    private String codigoCiclo;

    public Alumno(String nombre, String apellido1, String apellido2, String email,
            String fechaNacimiento, String codigoCiclo) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.codigoCiclo = codigoCiclo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCodigoCiclo() {
        return codigoCiclo;
    }

    public void setCodigoCiclo(String codigoCiclo) {
        this.codigoCiclo = codigoCiclo;
    }
    
}
